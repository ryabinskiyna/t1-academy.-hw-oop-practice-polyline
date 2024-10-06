class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point... points) {
        super(points);
    }

    @Override
    public double length() {
        double polylineLength = super.length();

        int last = points.length - 1;
        double lenX = points[0].x - points[last].x;
        double lenY = points[0].y - points[last].y;
        double closingSegmentLength = Math.sqrt(lenX * lenX + lenY * lenY);

        return polylineLength + closingSegmentLength;
    }
}