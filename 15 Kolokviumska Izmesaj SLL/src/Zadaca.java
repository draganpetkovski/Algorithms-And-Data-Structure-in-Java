import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/* за дадена листа од a0 до an да се испечати како резултат a0 an-1 a1 an-2 a2 an-3...

Пример : 12345
Излез : 15243
 
Забелешка: несмеат нови листи да се креираат и несмее бришење на елементите во листата.
+Работа со јазлите
+SLL*/
public class Zadaca {
	
	public static void izmeshajLista(SLL<Integer> lista){
		SLLNode<Integer>dvizi1=lista.getFirst();
		
		for(int i=0;i<lista.length()/2;i++) {
			dvizi1=dvizi1.succ;
		}
		
		SLLNode<Integer>dvizi2=dvizi1.succ;
		dvizi1.succ=null;
		
		SLLNode<Integer>prev=null;
		SLLNode<Integer>curr=dvizi2;
		while(curr!=null) {
			SLLNode<Integer>curNext=curr.succ;
			curr.succ=prev;
			prev=curr;
			curr=curNext;
		}
		
		dvizi2=prev;
		dvizi1=lista.getFirst();
		
		while(dvizi1!=null && dvizi2!=null) {
			SLLNode<Integer>temp1=dvizi1.succ;
			SLLNode<Integer>temp2cur=dvizi2;
			dvizi1.succ=temp2cur;
			dvizi2=dvizi2.succ;
			temp2cur.succ=temp1;
			dvizi1=temp1;
			
			
			
		}
		
		System.out.println(lista);
		
        
		
	}
public static void izmeshajLista1(SLL<Integer> lista){
		
		SLLNode<Integer> prv = lista.getFirst();
        SLLNode<Integer> vtor = lista.getFirst();
       
        while(prv.succ != null){           
            if(vtor.succ.succ==null){
                break;
            }
            while(vtor.succ.succ != null){
                vtor=vtor.succ;   //izminuva do kraj
            } //posle while cikluso vtor e poslednio element
            
            SLLNode<Integer> temp = vtor.succ; //temp ja zima vrednosta na vtor
            lista.insertAfter(temp.element, prv); //vtor(poslednio se dodava posle prv)
            vtor.succ=null; //vtor(poslednio pokazuva na null trga se )
            prv=prv.succ.succ; //prvio ode za 2 napred 
            vtor = prv; // vtorio pa se setira na pozicija na prv
        }
            System.out.println(lista.toString());
        
		
	}
	 
	
	public static void main(String[] args) throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));		
		SLL<Integer> lista = new SLL<Integer>();
		String s = input.readLine();
		int n = Integer.parseInt(s);
		s = input.readLine();
		String []pom = s.split(" ");
	
		for(int i=0;i<n;i++){
			lista.insertLast(Integer.parseInt(pom[i]));
		}		
		
		izmeshajLista(lista);
		izmeshajLista1(lista);

	} 

} 
