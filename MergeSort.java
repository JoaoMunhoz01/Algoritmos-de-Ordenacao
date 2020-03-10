package Algoritmos;

import java.util.Scanner;

class MergeSort {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    int [] vet = new int [n];
    
    for(int i = 0; i < vet.length; i++){
      vet[i] = input.nextInt();
    }
    merge(vet, 0, vet.length-1);
    for(int i = 0; i < vet.length; i++){
      System.out.print(vet[i]+ " ");
    }
    input.close();
  }
  
  
  
  public static void merge(int a[], int inicio, int fim){
    if(inicio < fim){
      int meio = (inicio+fim)/2;
      merge(a, inicio, meio);
      merge(a, meio + 1, fim);
      combina(a, inicio, meio, fim);
    }
  }
  
  
  
  public static void combina(int vet[], int inicio, int meio, int fim){
    //CRIAR B;
    int [] newVet = new int[vet.length];
    //COPIAR B;
    for(int i =0; i < vet.length; i++){
      newVet[i]=vet[i];
    }
    
    int k = inicio;
    int e = inicio;
    int d = meio+1;

    
    while(e<= meio && d <= fim){
      if(newVet[e] > newVet[d]){
        vet[k] = newVet[e];
        k++;
        e++;
      }  
      else{
        vet[k]=newVet[d];
        k++;
        d++;
      }
    }
    while(e<= meio){
      vet[k]=newVet[e];
      k++;
      e++;
    }
    while(d<= fim){
      vet[k]=newVet[d];
      k++;
      d++;
    }
  }
}