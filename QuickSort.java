package Algoritmos;

import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n= input.nextInt();
    int v [] = new int [n];
    for(int i = 0; i < v.length; i++){
      v[i]=input.nextInt();
    }
    quickSort(v, 0, v.length-1);
    for(int i = 0; i < v.length ; i++){
      System.out.print(v[i]+" ");
    }
    
    input.close();
  }
  
  public static void quickSort(int v[], int i, int f){
    if(i >= f){
      return;
    }
    int pivo = particiona(v, i, f);
    quickSort(v, i, pivo-1);
    quickSort(v, pivo+1, f);
  }
  
  public static int particiona(int v[], int i, int f){
    int pos = i;
    int pivo = f;
    
    while(i >= f && v[i]<=v[pivo]){
      i++; 
      pos++;
    }
    while(i<f){
      if(v[i] > v[pivo]){
        i++;
      }
      else{
        troca(v, pos, i);
        pos++;
        i++;
      }
    }
    troca(v, pivo, pos);
    return pos;
  }
  
  public static void troca(int v[], int i, int j) {
    int aux = v[i];
    v[i] = v[j];
    v[j] = aux;
  }
  
  
} 