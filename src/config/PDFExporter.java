
package Config;
import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import com.lowagie.text.pdf.draw.LineSeparator;


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import java.io.File;
import java.io.FileOutputStream;

public class PDFExporter {

  public static void exportSelectedRowsToPDF(JTable table, int[] selectedRows) {
    JFileChooser chooser = new JFileChooser();
    chooser.setDialogTitle("Save PDF");
    chooser.setFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));

    int result = chooser.showSaveDialog(null);
    if (result != JFileChooser.APPROVE_OPTION) return;

    File file = chooser.getSelectedFile();
    String filePath = file.getAbsolutePath();
    if (!filePath.toLowerCase().endsWith(".pdf")) {
        filePath += ".pdf";
    }

    Document document = new Document(PageSize.A4, 50, 50, 50, 50); // margin adjustments

    try {
        PdfWriter.getInstance(document, new FileOutputStream(filePath));
        document.open();

        // Company Header
        PdfPTable headerTable = new PdfPTable(2);
        headerTable.setWidthPercentage(100);
        headerTable.setWidths(new int[]{1, 4});

        try {
            Image logo = Image.getInstance("Images/logo.png");
            logo.scaleToFit(60, 60);
            PdfPCell logoCell = new PdfPCell(logo);
            logoCell.setBorder(Rectangle.NO_BORDER);
            headerTable.addCell(logoCell);
        } catch (Exception e) {
            PdfPCell logoCell = new PdfPCell(new Phrase(""));
            logoCell.setBorder(Rectangle.NO_BORDER);
            headerTable.addCell(logoCell);
        }

        Font headerFont = new Font(Font.HELVETICA, 14, Font.BOLD);
        Font subFont = new Font(Font.HELVETICA, 10, Font.NORMAL);
        PdfPCell companyCell = new PdfPCell();
        companyCell.setBorder(Rectangle.NO_BORDER);
        companyCell.addElement(new Phrase("ESTRERA INDUSTRIES Inc.", headerFont));
        companyCell.addElement(new Phrase("6018 Panadtaran, San Fernando Cebu City, Phillipines", subFont));
        companyCell.addElement(new Phrase("Phone: (+63) 991 218 0936 | Email: andreestrera20@gmail.com", subFont));
        headerTable.addCell(companyCell);

        document.add(headerTable);
        document.add(Chunk.NEWLINE);

        // Title
        Font titleFont = new Font(Font.HELVETICA, 16, Font.BOLD);
        Paragraph title = new Paragraph("Payroll Receipt", titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        
        document.add(Chunk.NEWLINE);

        TableModel model = table.getModel();
        Font labelFont = new Font(Font.HELVETICA, 11, Font.BOLD);
        Font valueFont = new Font(Font.HELVETICA, 11);

        for (int rowIndex : selectedRows) {
            // Section 1: Employee Info
            PdfPTable infoTable = new PdfPTable(2);
            infoTable.setWidthPercentage(100);
            infoTable.setSpacingBefore(10f);
            infoTable.setSpacingAfter(10f);
            infoTable.getDefaultCell().setPadding(5);

            Paragraph infoTitle = new Paragraph("Employee Information", labelFont);
            infoTitle.setSpacingBefore(5f);
            document.add(infoTitle);
            document.add(Chunk.NEWLINE);

            for (int col = 0; col < model.getColumnCount(); col++) {
                String colName = model.getColumnName(col).toLowerCase();
                if (colName.contains("name") || colName.contains("employee_id")) {
                    String label = model.getColumnName(col);
                    String value = model.getValueAt(rowIndex, col).toString();
                    PdfPCell labelCell = new PdfPCell(new Phrase(label + ":", labelFont));
                    PdfPCell valueCell = new PdfPCell(new Phrase(value, valueFont));
                    infoTable.addCell(labelCell);
                    infoTable.addCell(valueCell);
                }
            }
            document.add(infoTable);

            // Section 2: Payroll Summary
            Paragraph summaryTitle = new Paragraph("Payroll Summary", labelFont);
            summaryTitle.setSpacingBefore(5f);
            document.add(summaryTitle);
            document.add(Chunk.NEWLINE);

            PdfPTable payrollTable = new PdfPTable(2);
            payrollTable.setWidthPercentage(100);
            payrollTable.setSpacingBefore(5f);
            payrollTable.getDefaultCell().setPadding(5);

            for (int col = 0; col < model.getColumnCount(); col++) {
                String colName = model.getColumnName(col).toLowerCase();
                if (!colName.contains("name") && !colName.contains("employee_id")) {
                    String label = model.getColumnName(col);
                    String value = model.getValueAt(rowIndex, col).toString();
                    PdfPCell labelCell = new PdfPCell(new Phrase(label + ":", labelFont));
                    PdfPCell valueCell = new PdfPCell(new Phrase(value, valueFont));
                    payrollTable.addCell(labelCell);
                    payrollTable.addCell(valueCell);
                }
            }

            document.add(payrollTable);
            document.add(Chunk.NEWLINE);

            // Separator line
            document.add(new Paragraph(" "));
            document.add(new LineSeparator());
            document.add(new Paragraph(" "));
        }

        // Signature
        Paragraph signLine = new Paragraph("Authorized Signature: ___________________________", valueFont);
        signLine.setSpacingBefore(30f);
        document.add(signLine);

        // Date
        Paragraph footer = new Paragraph("Generated on: " + java.time.LocalDate.now(), subFont);
        footer.setAlignment(Element.ALIGN_RIGHT);
        footer.setSpacingBefore(10f);
        document.add(footer);

        document.close();
        JOptionPane.showMessageDialog(null, "PDF exported successfully to:\n" + filePath);
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error generating PDF: " + e.getMessage(), "PDF Export Error", JOptionPane.ERROR_MESSAGE);
    }
}


    }

