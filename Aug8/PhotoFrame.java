class PhotoFrame
{
	int size;
	PhotoFrameMaterial material;     //use ref to instantiate
	double price;
	int warranty;
	String shape;
	PhotoFramecolors[] colors;
	
	PhotoFrame(int size,double price,int warranty)
	{
		this.size=size;
		this.price=price;
		this.warranty=warranty;
		
	}
	void setShape(String shape)
	{
		this.shape=shape;
	}
	void setColor(PhotoFramecolors[] colors)
	{
		this.colors=colors;
	}
	void dataPrint()
	{
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.warranty);
		System.out.println(this.shape);
		System.out.println(this.material);
		for(int watch=0;watch<this.colors.length;watch++)
		{
		System.out.println(this.colors[watch]);			
		}
	}
	

}