import java.util.*;
import java.io.*;

public class SpinningMatrix{
public static void main(String args[]){
int n=3;
int[][] a={{1,2,3},{4,5,6},{7,8,9}};
int[][] b=new int[n][n];
for(int i=0;i<n;i++){
int k=0;
for(int j=n-1;j>-1;j--){
b[i][k]=a[j][i];
k++;
}
}
System.out.println("[");
for(int i=0;i<n;i++){
System.out.print("[");
for(int j=0;j<n;j++){
System.out.print(b[i][j]);
if(j<n-1 && j<n){
System.out.print(",");
}
}
System.out.print("]");
if(i<n-1){
System.out.print(",");
}
System.out.println();
}
System.out.println("]");
}
}

/*
[
[7,4,1],
[8,5,2],
[9,6,3]
]
*/