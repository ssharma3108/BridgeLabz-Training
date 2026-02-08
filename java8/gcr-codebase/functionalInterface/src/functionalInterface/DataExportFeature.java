package functionalInterface;

interface ReportExporter {

    void export(); // existing functionality

    // new feature added later
    default void exportToJSON() {
        System.out.println("Report exported successfully in JSON format");
    }
}

class CSVExporter implements ReportExporter {
    public void export() {
        System.out.println("Report exported successfully in CSV format");
    }
}

class PDFExporter implements ReportExporter {
    public void export() {
        System.out.println("Report exported successfully in PDF format");
    }
}

public class DataExportFeature {
    public static void main(String[] args) {

        ReportExporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON();   // default method

        ReportExporter pdf = new PDFExporter();
        pdf.export();
        pdf.exportToJSON();   // default method
    }
}
