/**
 * Bryan Soriano CS301 Homework 1
 */

package cs301.Coloring;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.graphics.Bitmap;
import java.lang.Integer;

public class DrawView extends SurfaceView {

    Paint leaves = new Paint();
    Paint wood = new Paint();
    Paint cloud = new Paint();
    Paint boat = new Paint();
    Paint flag = new Paint();
    Paint sun = new Paint();

    private DrawModel model;

    /**
     * ctor must be overridden here as per standard Java inheritance practice.  We need it
     * anyway to initialize the member variables
     */
    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);

        this.model = new DrawModel();

        //This is essential or your onDraw method won't get called
        setWillNotDraw(false);

        //Setup our palette
        wood.setColor(Color.BLACK);  //trunk
        wood.setStyle(Paint.Style.FILL);
        leaves.setColor(Color.rgb(0, 255, 0));  //leaves
        leaves.setStyle(Paint.Style.FILL);
        cloud.setColor(Color.WHITE);//cloud
        cloud.setStyle(Paint.Style.FILL);
        boat.setColor(Color.rgb(211, 211, 211)); //gray
        boat.setStyle(Paint.Style.FILL);
        flag.setColor(Color.rgb(0, 255, 255));
        flag.setStyle(Paint.Style.FILL);
        sun.setColor(Color.rgb(255, 255, 0));
        sun.setStyle(Paint.Style.FILL);
        setBackgroundColor(Color.BLUE);

    }

    /**
     * setting colors when values change
     */
    public void setTrunk(int r, int g, int b) {
        wood.setColor(Color.rgb(r, g, b));
        wood.setStyle(Paint.Style.FILL);
    }

    public void setLeaves(int r, int g, int b) {
        leaves.setColor(Color.rgb(r, g, b));
        leaves.setStyle(Paint.Style.FILL);
    }
    public void setCloud(int r, int g, int b){
        cloud.setColor(Color.rgb(r,g,b));
        cloud.setStyle(Paint.Style.FILL);
    }
    public void setSun(int r, int g, int b){
        sun.setColor(Color.rgb(r,g,b));
        sun.setStyle(Paint.Style.FILL);
    }
    public void setFlag(int r, int g, int b){
        flag.setColor(Color.rgb(r,g,b));
        flag.setStyle(Paint.Style.FILL);
    }
    public void setBoat(int r, int g, int b){
        boat.setColor(Color.rgb(r,g,b));
        boat.setStyle(Paint.Style.FILL);
    }
    public void drawSun(Canvas canvas){
        canvas.drawOval(1400, 30, 1600, 200, sun);
    }
    public void drawBoat(Canvas canvas){
        //The following 7 lines were from StackOverflow from the user Androidcoder (Jun 4, 2012)
        Path ship = new Path();
        ship.reset(); // only needed when reusing this path for a new build
        ship.moveTo(1300, 500); // used for first point
        ship.lineTo(1700, 500);
        ship.lineTo(1600, 700);
        ship.lineTo(1400, 700);
        ship.lineTo(1300, 500); // there is a setLastPoint action but i found it not to work as expected

        Path banner = new Path();
        banner.reset(); // only needed when reusing this path for a new build
        banner.moveTo(1500, 250); // used for first point
        banner.lineTo(1700, 300);
        banner.lineTo(1500, 350);
        banner.lineTo(1500, 250);
        Paint stick = new Paint();
        stick.setColor(Color.BLACK);
        stick.setStyle(Paint.Style.FILL);
        canvas.drawRect(1500, 250, 1510, 500, stick);
        canvas.drawPath(ship, boat);
        canvas.drawPath(banner, flag);
    }
    public void drawTree(Canvas canvas) {
        canvas.drawRect(900, 400, 1000, 800, wood);
        canvas.drawOval(750,100,1150,500,leaves);
    }

     public void drawCloud(Canvas canvas) {
         canvas.drawOval(100, 100, 500, 300, cloud);
         canvas.drawOval(300, 100, 700, 300, cloud);
     }


    /**
     *
     */
    @Override
    public void onDraw(Canvas canvas)
    {
        drawCloud(canvas);
        drawTree(canvas);
        drawBoat(canvas);
        drawSun(canvas);
    }//onDraw

    public DrawModel getDrawModel(){
        return model;
    }
//  The following code was from online recourse. I attempted to use this method for getting current color values. Didn't work out.
//    public int getRed(int x, int y){
//        this.buildDrawingCache();
//        Bitmap bmap = this.getDrawingCache();
//        int colour = bmap.getPixel(x, y);
//        int red = Color.red(colour);
//        return red;
//    }
//    public int getGreen(int x, int y){
//        this.buildDrawingCache();
//        Bitmap bmap = this.getDrawingCache();
//        int colour = bmap.getPixel(x, y);
//        int green = Color.green(colour);
//        return green;
//    }
//    public int getBlue(int x, int y){
//        this.buildDrawingCache();
//        Bitmap bmap = this.getDrawingCache();
//        int colour = bmap.getPixel(x, y);
//        int blue = Color.blue(colour);
//        return blue;
//    }
}

