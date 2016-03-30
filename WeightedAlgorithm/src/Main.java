
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] x = {100,120,115,120,113,120,40,110,140,120,110,140};
		double[] y = {120,110,110,120,140,110,130,100,102,23,140,122};
		double[] area = {200,233,235,200,230,210,200,201,200,230,200};
		WeightedAverage ave = new WeightedAverage(50,300);
		for(int k =0; k<20; k++)
		{
			/*for(int i =0; i<x.length; i++)
			{
				ave.xIn(x[i]);
				System.out.println(ave.getAverage("x"));
			}
			System.out.println("y");
			for(int i =0; i<y.length; i++)
			{
				ave.yIn(y[i]);
				System.out.println(ave.getAverage("y"));
			}
			System.out.println("area");
			for(int i =0; i<area.length; i++)
			{
				ave.areaIn(area[i]);
				System.out.println(ave.getAverage("area"));
			}*/
			//filter system test
			ave.cal=true;
			for(int i=0; i<ave.centerX.length; i++)
			{
				if(ave.centerX[i]==-1)
				{
					ave.cal=false;
				}
			}
			
			if(ave.cal==false)
			{
				int index =-1;
				double score =0;
				double corScore=.7;
				//replace this loop with a loop to look through length and make score
				//length[i]/width[i]
				for(int j=0; j<3; j++)
				{
					score = (double) (Math.random()*160+30)/100;
					System.out.println(score + " generated at "+j);
					if(Math.abs(score-1)<Math.abs(corScore-1))
					{
						corScore=score;
						index = j;
					}
				}
				if(index ==-1)
				{
					System.out.println("No good input");
				}
				else
				{
					System.out.println(" 	"+corScore + " was closest at "+index);
					//put in centerX[index] here instead of corScore
					ave.xIn(corScore);
				}
			}
			else
			{
				System.out.print(ave.getAverage("x"));
			}
	
		}
	}

}
