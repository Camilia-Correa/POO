#include "iostream"
#include "cstdlib"
#include "ctime"
#include "stdio.h"

using namespace std;

int main()
{
	srand(time(NULL));
	int nums[4]={1,3,7,9};
	int nums1[2]={6,8};
	int nums3[2]={4,8};
	int nums7[2]={2,6};
	int nums9[2]={2,4};
	
	int size=4;
	int ind,ind2;
	 int i=0, j=0;
	int a[3][3];
	   for( i=0;i<3;i++)
    {
       for( j=0;j<3;j++ )
         {
         	a[i][j]=0;
        }
    }

    a[1][1]=5;
    ind=rand()%size;
			
		if(nums[ind]==1){ a[0][1]=1; a[2][1]=9; 
		                  ind2=rand()%2;
		                 	if(nums1[ind2]==6){a[0][0]=6;
						                      a[0][2]=8; 
						                      a[1][0]=7;
											  a[2][0]=2;
											  a[1][2]=3;
											  a[2][2]=4; } 
										
						  if(nums1[ind2]==8){a[0][0]=8; 
						                     a[0][2]=6; 
											 a[1][0]=3; 
											 a[2][0]=4; 
											 a[1][2]=7; 
											 a[2][2]=2; }	    }
			
		if(nums[ind]==3){ a[0][1]=3; a[2][1]=7;  
		                   ind2=rand()%2; 
						   
						   if(nums3[ind2]==4){
						                        a[0][0]=4;
											    a[0][2]=8; 
												a[1][0]=9; 
												a[2][0]=2; 
												a[1][2]=1;
												a[2][2]=6; } 
												 
					   	if(nums3[ind2]==8){
						                       a[0][0]=8; 
											   a[0][2]=4; 
											   a[1][0]=1; 
											   a[2][0]=6; 
											   a[1][2]=9; 
											   a[2][2]=2; }	
											   
											    }
		
		
		if(nums[ind]==7){ a[0][1]=7; a[2][1]=3;  
		                  ind2=rand()%2;
					
						  if(nums7[ind2]==2){
						                     a[0][0]=2; 
											 a[0][2]=6; 
											 a[1][0]=9; 
											 a[2][0]=4; 
											 a[1][2]=1;
											 a[2][2]=8; } 
											 
				         if(nums7[ind2]==6){
						                     a[0][0]=6; 
											 a[0][2]=2; 
											 a[1][0]=1; 
											 a[2][0]=8; 
											 a[1][2]=9; 
											 a[2][2]=4; } 
											 
											 }
		
		
		if(nums[ind]==9){ a[0][1]=9; a[2][1]=1;  
		                ind2=rand()%2;
					
						if(nums9[ind2]==2){
						                     a[0][0]=2; 
											 a[0][2]=4; 
											 a[1][0]=7; 
											 a[2][0]=6; 
											 a[1][2]=3;
											 a[2][2]=8; } 
											 
				       if(nums9[ind2]==4){
					                         a[0][0]=4; 
											 a[0][2]=2; 
											 a[1][0]=3; 
											 a[2][0]=8; 
											 a[1][2]=7; 
											 a[2][2]=6; }
											 
											  }
		
	cout<<endl;
	
	system("color 90");
	cout<<"\n MATRIZ CUADRO MAGICO \n";
	cout<<"\n";
    for( i=0 ; i<3 ; i++)
    {
         for( j=0 ; j<3 ; j++ )
         {
              cout<<a[i][j]<<", ";
         }
		 cout<<"  \n";
    }
    cout<<"\n";
	system("pause");
	return 0;
}
