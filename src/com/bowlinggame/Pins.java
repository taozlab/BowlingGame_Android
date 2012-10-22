package com.bowlinggame;

public class Pins 
{
	private int[] aiPins;
	private int iCount;
	
	public Pins()
	{
		iCount = 21;
		aiPins = new int[iCount];
		for (int i=0; i<iCount; i++)
		{
			aiPins[i]=-1;
		}
	}
	
	public int getCount()
	{
		return iCount;
	}
	
	public void reset()
	{
		for (int i=0; i<iCount; i++)
		{
			aiPins[i]=-1;
		}		
	}
	
	public int setPinByPos(int iPos, int iPins)
	{
		aiPins[iPos]=iPins;
		return iPos;
	}
	
	public int getPinByPos(int iPos)
	{
		return aiPins[iPos];
	}
	
	public int getValidCount()
	{
		int iPos=0;
		while (aiPins[iPos]!=-1)
		{
			iPos++;
			if (iPos>=iCount) break;
		}
		return iPos;
	}
}
