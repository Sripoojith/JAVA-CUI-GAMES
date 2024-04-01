import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EightPuzzleGame
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		int matrix[][] = new int[3][3];
		
		//int matrix[][] = {{1,2,3},{4,9,6},{7,5,8}};
        
		                  
		 System.out.println("welcome to 8 puzzle game");
		 
		 boardBuild(matrix);
		 
	
		 boolean flag = print(matrix);
		 
		 while(!flag){
		      
		     System.out.println("enter Move");
		     
		     int move = sc.nextInt();
		     
		     System.out.println("------------");
		     
		     move(matrix,move);
		     
		     flag = print(matrix);
		     
		     if(flag){
		         System.out.println("Game finished thankYou");
		     }
		 }          
		           
	}
	
	static void boardBuild(int[][] matrix){
	    List<Integer> li = new ArrayList();
	    li.add(1);li.add(2);li.add(3);li.add(4);li.add(5);li.add(6);li.add(7);li.add(8);li.add(9);
	    Collections.shuffle(li);
	    int count = 0;
	    for(int i = 0;i < 3 ;i++){
	        for(int j = 0;j < 3; j++){
	            matrix[i][j] = li.get(count);
	            count++;
	        }
	    }
	}
	
	
	static boolean print(int[][] matrix){
	    int count = 0;
	    for(int i = 0;i < matrix.length;i++){
	        for(int j = 0; j<matrix[i].length; j++){
	            if(count < matrix[i][j]){
	                count++;
	            }
	            if(matrix[i][j] == 9){
	                System.out.print("  ");
	            }else
	                System.out.print(matrix[i][j] + " ");
	        }
	        System.out.println();
	    }
	    return count == 9;
	}
	
	
	
	static void move(int[][] matrix,int move){
	    
	    int movRow = 0; int movCol= 0;
	    int eRow = 0; int eCol = 0;
	    for(int i = 0;i < matrix.length;i++){
	        for(int j = 0; j<matrix[i].length; j++){
	            if(matrix[i][j] == move){
	                movRow = i;
	                movCol = j;
	            }
	            if(matrix[i][j] == 9){
	                eRow = i;
	                eCol = j;
	            }
	        }
	    }
	    if(movRow == eRow-1 || movRow == eRow+1){
	        if(movCol == eCol){
	            swap(matrix,movRow,movCol,eRow,eCol);
	        }
	    }
	    else if(movCol == eCol-1 || movCol == eCol+1){
	        if(movRow == eRow){
	            swap(matrix,movRow,movCol,eRow,eCol);
	        }
	    }else{
	        System.out.println("invalid move");
	    }
	    
	    
	}
	static void swap(int[][] matrix,int movRow,int movCol,int eRow,int eCol){
	    int temp = matrix[movRow][movCol];
	    matrix[movRow][movCol] = matrix[eRow][eCol];
	    matrix[eRow][eCol] = temp;
	}
}
