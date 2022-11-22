import java.util.*;
import java.io.*;

public class SpinningMatrix{

public static void main(String args[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b=new int[][];
for(int i=0;i<n;i++){
int k=0;
for(int j=n-1;j<=0;j--){
b[i][k]=a[j][i];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(a[i]j[]);
}
System.out.println();
}
}
}