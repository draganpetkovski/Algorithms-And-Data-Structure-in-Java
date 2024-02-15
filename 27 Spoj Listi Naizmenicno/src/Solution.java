/* Наизменично спои листи
Дадени се две еднострано поврзани листи чии што jазли содржат по еден при-
роден броj. Треба да се споjат двете листи во една резултантна на тоj начин што
наизменично прво ´ке се додаваат првите два jазли од првата листа во резултант-
ната, па првите два од втората листа, па следните два од првата, па следните два
од втората итн. Jазлите што ´ке останат треба да се додадат на краj во резултан-
тната листа, прво оние што останале од првата листа, потоа оние што останале
од втората листа.
Влез: Во првата линиjа е даден броjот на елементи на првата листа, па вто-
рата линиjа се даваат броевите во листата одделени со празно место.Во третата
линиjа броjот на елементи на втората листа, па четвртата линиjа се даваат бро-
евите во листата одделени со празно место.
Излез: На излез треба да се испечатат jазлите по редослед во резултантната
споена листа.
Пример.
Влез:
5
5 7 9
8
1 1 4 5 6 8 9 4
Излез:
5->7->1->1->9->4->5->6->8->9->4 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL<Integer>list=new SLL<Integer>();
		list.insertLast(5);
		list.insertLast(7);
		list.insertLast(9);
//		list.insertLast(3);
//		list.insertLast(1);
//		list.insertLast(3);
//		list.insertLast(5);
//		list.insertLast(7);
//		list.insertLast(2);
//		list.insertLast(4);
//		
		SLL<Integer>list2=new SLL<Integer>();
		list2.insertLast(1);
		list2.insertLast(1);
		list2.insertLast(4);
		list2.insertLast(5);
		list2.insertLast(6);
		list2.insertLast(8);
		list2.insertLast(9);
		SLL<Integer>rezultantna= new SLL<Integer>();


		SLLNode<Integer>tmp=list.getFirst();
		SLLNode<Integer>tmp2=list2.getFirst();
		
		while(tmp!=null && tmp2!=null) {
			for(int i=0;i<2 && tmp!=null;i++) {
				rezultantna.insertLast(tmp.element);
				tmp=tmp.succ;
			}
			for(int i=0;i<2 && tmp2!=null;i++) {
				rezultantna.insertLast(tmp2.element);
				tmp2=tmp2.succ;
			}			
		}
		
		
		while(tmp!=null) {
			rezultantna.insertLast(tmp.element);
			tmp=tmp.succ;
		}
		
		while(tmp2!=null) {
			rezultantna.insertLast(tmp2.element);
			tmp2=tmp2.succ;
		}
		
		
		System.out.println(rezultantna);
		
		
		

	}

}
