
public class account {
	private String name;
	private int [] scores; 
	private int avg;
	private int interval;
	
	public void setRecord(String name, int[] scores, int interval){
		this.name = name;
		this.scores = scores;
		this.interval = interval;
		
	} // this method works like an input parameter processor
	
	public int calcuateAvarage(){
		avg = 0;
		int scoreSize = this.scores.length;
		for(int i = 0; i < scoreSize; i++){
			avg += scores[i];
		}
		//this.avg = avg;
		return avg/scoreSize;
	}
	
	public String totalOccurance(){
		int threshHold = 1;
		if(this.interval > threshHold){
			return "out of range";
		}else{
			return "in range";
		}
		
	}
	
	public int[] sortArray(){
		int [] newSortedArray = {};
		for(int i = 0; i < this.scores.length; i++ ){
			if(this.scores[i] > this.scores[i+1]){
				newSortedArray[i] = this.scores[i+1];
			}
		}
		return newSortedArray;
	}
	
	public String getRecord(){
		return name + '/' + this.calcuateAvarage() +'/'+ this.totalOccurance();
	}
	
}
