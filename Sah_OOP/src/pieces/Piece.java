
package pieces;

import java.util.ArrayList;

import chess.Cell;


/**
 * Aceasta este clasa Piesa. Este o clasa abstracta de unde toate piesele o vor mosteni
 * Defineste toate functile comune in toate piesele
 * Functia move() este o functie abstracta ce va fi rescrisa in toate clasele mostenite 
 * Implementeaza interfata Cloneable deoarece o copie a piesei este necesara foarte des
 */
public abstract class Piece implements Cloneable{

	//Variabile Membru
	private int color;
	private String id=null;
	private String image;
	protected ArrayList<Cell> possiblemoves = new ArrayList<Cell>();  //Protected (acces din clasele 'copil')
	public abstract ArrayList<Cell> move(Cell pos[][],int x,int y);  //Functie Abstracta trebuie sa fie overridden
	
	//Id Setter
	public void setId(String id)
	{
		this.id=id;
	}
	
	//Path Setter
	public void setImage(String image)
	{
		this.image=image;
	}
	
	//Color Setter
	public void setColor(int c)
	{
		this.color=c;
	}
	
	//Path getter
	public String getImage()
	{
		return image;
	}
	
	//Id getter
	public String getId()
	{
		return id;
	}
	
	//Color Getter
	public int getcolor()
	{
		return this.color;
	}
	
	//Functie ce returneaza o copie a obiectului. Copia are aceeasi valori ale varaibilelor, dar cu referente diferite.
	public Piece getcopy() throws CloneNotSupportedException
	{
		return (Piece) this.clone();
	}
}
