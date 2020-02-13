package atividade_contador;

public class Counting {
	
	int vA;
	int vB;
	int vC;
	
	public Counting(int numA, int numB)
	{
		this.vA = numA;
		this.vB = numB;
		this.vC = this.vA+this.vB;
	}

	public int getvA() {
		return vA;
	}

	public int getvB() {
		return vB;
	}

}
