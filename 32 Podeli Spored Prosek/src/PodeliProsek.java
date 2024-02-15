/* Подели според просек
Дадена е двострано поврзана листа чии што jазли содржат по еден природен броj.
Листата треба да се подели на две резултантни листи, т.ш. во првата листа треба
да се сместат сите jазли кои содржат броеви помали или еднакви на просекот
на листата, а во втората сите jазли кои содржат броеви поголеми од просекот на
листата. Jазлите во резултантните листи се додаваат според обратен редослед
од оноj по коj по коj се поjавуваат во дадената листа (т.е. прво се започнува со
разгледување на последниот jазол од влезната листа и се додава во соодветната
резултантна листа, па претпоследниот итн...).
Влез: Во првиот ред од влезот е даден броjот на jазли во листата, а во вториот
ред се дадени броевите од кои се составени jазлите по редослед во листата.
Излез: Во првиот ред од излезот треба да се испечатат jазлите по редослед од
првата резултантна листа (броеви помали или еднакви на просекот на листата),
во вториот ред од втората (броеви поголеми од просекот на листата).
Пример.
Влез:
69
5
4 2 1 5 3
Излез:
3 1 2
5 4 */
public class PodeliProsek {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLL<Integer>list=new DLL<Integer>();
		list.insertLast(4);
		list.insertLast(2);
		list.insertLast(1);
		list.insertLast(5);
		list.insertLast(3);


		DLLNode<Integer>tmp=list.getFirst();
		float suma=0;
		while(tmp!=null) {
			suma+=tmp.element;
			tmp=tmp.succ;
		}
		
		float prosek=suma/list.length();
		
		System.out.println(prosek);
		DLL<Integer>pomali=new DLL<Integer>();
		DLL<Integer>pogolemi=new DLL<Integer>();

		tmp=list.getLast();
		while(tmp!=null) {
			if(tmp.element<=prosek) {
				pomali.insertLast(tmp.element);
			}
			else pogolemi.insertLast(tmp.element);
			
			tmp=tmp.pred;
		}
		
		System.out.println(pomali);
		System.out.println(pogolemi);


	}

}
