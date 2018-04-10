package art.view;

import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

import art.controller.ArtController;

public class ShapeCanvas extends JPanel
{

	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private ArtController app;
	
	private BufferedImage canvasImage;
	
	public ShapeCanvas(ArtController app)
	{
	}
	public Object clear()
	{

		return null;
	}

	public Object save()
	{

		return null;
	}

	public Object changeBaackground()
	{

		return null;
	}

	public void addShape(Ellipse2D ellipse)
	{

		
	}

	public void addShape(Polygon triangle)
	{
		
	}

	public void addShape(Rectangle rectangle)
	{
		
	}
	
}
