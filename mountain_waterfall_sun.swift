import UIKit

//this class handles logic for displaying a "happy Heart"
class HappyHeart {
    //stores the point of the Heart
    var points: [CGPoint] = []
    //centered coordinates of the heart
    let center = CGPoint(x: 0, y: 0)
    //stores a UIBezierPath object to draw the heart
    private var path: UIBezierPath?
    
    //default initializer
    public init() {
        //initialize the UIBezierPath and set the initial point
        path = UIBezierPath()
        path?.move(to: center)
    }
    
    //this method adds a point to the points array and adds the point to the path
    public func addPoint(_ point: CGPoint) {
        //add the point to the points array
        points.append(point)
        //add the point to the path
        path?.addLine(to: point)
    }
   
    //this method returns the points in the path
    public func getPoints() -> [CGPoint] {
        return points
    }
    
    //this method draws the heart
    public func draw Heart() {
        //begin the stroke and set the line width and color
        UIColor.red.setStroke()
        path?.stroke()
    }
    
    //this method draws the points of the heart
    public func drawPoints(context: CGContext) {
        //begin the line
        UIColor.black.setStroke()
        context.beginPath()
        
        //iterate through the points
        for point in points {
            //draw a circle around each point
            context.addArc(center: point, radius: 5.0, startAngle: 0.0, endAngle: .pi * 2.0, clockwise: true)
        }
        
        //stroke the path and set the line width
        context.strokePath()
        context.setLineWidth(2.0)
    }
}