import pkg.*;
public class Car  
{
	private double ex;
	private double why;
	private Ellipse base;
	private Ellipse cheese;
	private Color br;
	private Color ba;
	private Color gr;
	private Color bro;
	private Color whi;
	private Ellipse pep1;
	private Ellipse pep2;
	private Ellipse pep3;
	private Rectangle saus;
	private Ellipse spin;
	private Ellipse eye1;
	private Ellipse eye2;
	private Ellipse eye3;
	private Ellipse eye4;
	private Ellipse w1;
	private Ellipse w2;
	private Rectangle bbox;
	private Text fake;
	private Text s; 
	private Text begin;
	private int l=100;
	private int step=0;
	private int gh;
	private int gw;
	private String lab;
	private int st;
	private int rec=750;
	private int recc=125;
	private int recc2=-125;
	private Color c;
	public Car (double ex, double why,String lab, Color c)
	{
		base=new Ellipse(ex,why,l,l);
		br=new Color(139,106,12);
		base.setColor(c);
		cheese=new Ellipse(ex+7,why+7,l-14,l-14);
		ba=new Color(223,250,88);
		cheese.setColor(ba);
		pep1=new Ellipse(ex+20,why+20,l-80,l-80);
		pep1.setColor(Color.RED);
		pep2=new Ellipse(ex+60,why+20,l-80,l-80);
		pep2.setColor(Color.RED);
		saus=new Rectangle(ex+20,why+60,l-40,l-90);
		gr=new Color(17,162,46);
		saus.setColor(gr);
		spin=new Ellipse(ex+41.125,why+35,l-85,l-85);
		bro=new Color(162,114,17);
		spin.setColor(bro);
		eye1=new Ellipse(ex+25,why+25,l-90,l-90);
		whi=new Color(255,255,255);
		eye1.setColor(whi);
		eye2=new Ellipse(ex+65,why+25,l-90,l-90);
		eye2.setColor(whi);
		eye3=new Ellipse(ex+26.125,why+26.125,l-92.5,l-92.5);
		eye4=new Ellipse(ex+66.125,why+26.125,l-92.5,l-92.5);
		w1=new Ellipse(ex+10,why+80,l-70,l-70);
		w2=new Ellipse(ex+60,why+80,l-70,l-70);
		bbox=new Rectangle(base.getX(),base.getY(),base.getWidth(),base.getHeight()+w2.getHeight()-20);
		fake=new Text(ex,why,lab);
		gw=fake.getWidth();
		gh=fake.getHeight();
		s = new Text((base.getX()*2+base.getWidth())/2-(gw/2),(base.getY()*2+base.getHeight())/2-gh+11,lab);
		
	}

	public void draw()
	{
		base.fill();
		cheese.fill();
		pep1.fill();
		pep2.fill();
		saus.fill();
		spin.fill();
		eye1.fill();
		eye2.fill();
		eye3.fill();
		eye4.fill();
		w1.fill();
		w2.fill();
		s.draw();
	}
	public void translate(double ex, double why)
	{
		base.translate(ex,why);
		cheese.translate(ex,why);
		pep1.translate(ex,why);
		pep2.translate(ex,why);
		saus.translate(ex,why);
		spin.translate(ex,why);
		eye1.translate(ex,why);
		eye2.translate(ex,why);
		eye3.translate(ex,why);
		eye4.translate(ex,why);
		w1.translate(ex,why);
		w2.translate(ex,why);
		bbox.translate(ex,why);
		s.translate(ex,why);
	}
	public void bound()
	{
		bbox.draw();
	}
	public int getX()
	{
		return bbox.getX();
	}
	public int getY()
	{
		return bbox.getY();
	}
	public int getWidth()
	{
		return bbox.getWidth();
	}
	public int getHeight()
	{
		return bbox.getHeight();
	}
	public int getStep()
	{
		return step;
	}
	public void setStep(int st)
	{
		step=st;
	}
	public void drive()
	{
		if (bbox.getX() > 650)
		{
			int rann = Canvas.rand(50);
			base.translate(-rec-rann,recc);
			cheese.translate(-rec-rann,recc);
			pep1.translate(-rec-rann,recc);
			pep2.translate(-rec-rann,recc);
			saus.translate(-rec-rann,recc);
			spin.translate(-rec-rann,recc);
			eye1.translate(-rec-rann,recc);
			eye2.translate(-rec-rann,recc);
			eye3.translate(-rec-rann,recc);
			eye4.translate(-rec-rann,recc);
			w1.translate(-rec-rann,recc);
			w2.translate(-rec-rann,recc);
			bbox.translate(-rec-rann,recc);
			s.translate(-rec-rann,recc);
			recc=125;
		}
		// if (bbox.getX() < -50)
		// {
			// base.translate(rec,recc2);
			// cheese.translate(rec,recc2);
			// pep1.translate(rec,recc2);
			// pep2.translate(rec,recc2);
			// saus.translate(rec,recc2);
			// spin.translate(rec,recc2);
			// eye1.translate(rec,recc2);
			// eye2.translate(rec,recc2);
			// eye3.translate(rec,recc2);
			// eye4.translate(rec,recc2);
			// w1.translate(rec,recc2);
			// w2.translate(rec,recc2);
			// bbox.translate(rec,recc2);
			// s.translate(rec,recc2);
			// recc2=-125;
		// }
		if (bbox.getY() > 500)
		{
			recc=-500;
		}
		// if (bbox.getY() < -25)
		// {
			// recc2=500;
		// }
		
	}
	public Rectangle getBoundBox()
	{
		return bbox;
	}

}
	