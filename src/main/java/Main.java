public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        PolyLine polyline = new PolyLine(p1, p2, p3);
        System.out.println("Длина обычной ломаной: " + polyline.length());

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);
        System.out.println("Длина замкнутой ломаной: " + closedPolyLine.length());
    }
}