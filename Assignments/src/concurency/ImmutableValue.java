package concurency;

public class ImmutableValue{

	  private int value = 0;

	  public ImmutableValue(int value){
	    this.value = value;
	  }

	  public int getValue(){
	    return this.value;
	  }
	}