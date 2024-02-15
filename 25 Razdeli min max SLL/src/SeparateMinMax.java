/*Задача 1. Раздели min-max листа
Дадена е еднострано поврзана листа чии што jазли содржат по еден природен
броj. Во дадената листа треба да се пронаjдат елементите со наjмала и наjголе-
ма вредност и потоа листата треба да се подели на две резултантни еднострано
поврзани листи, т.ш. во првата листа треба да се сместат сите jазли кои содржат
броеви поблиски до наjмалиот елемент отколку до наjголемиот елемент, а во вто-
рата сите jазли кои содржат броеви поблиски до наjголемиот елемент отколку
до наjмалиот. Доколку елементот е на исто растоjание од наjмалиот и наjголе-
миот елемент тогаш се сместува во листата на елементи поблиски до наjмалот
елемент. Jазлите во резултантните листи се додаваат според редоследот по коj
се поjавуваат во дадената листа. (Помош: броjот 3 е на растоjание 2 од броjот
1 и на растоjание 4 од броjот 7. Следува дека броjот 3 е поблиску до броjот 1
отколку до броjот 7).
Влез: Во првата линиjа е даден броjот на елементи n. Во втората линиjа се
даваат броевите во листата одделени со празно место.
Излез: На излез во првиот ред треба да се испечатат jазлите по редослед на
првата резултантната листа (коjа содржи елементи кои се поблиску до наjмалиот
елемент). Во вториот ред треба да се испечатат jазлите на по редослед на втора-
та резултантната листа (коjа содржи елементи кои се поблиску до наjголемиот
елемент).
Пример.
Влез:
9
1 5 7 3 2 9 4 8 6
Излез:
1->5->3->2->4
7->9->8->6*/

public class SeparateMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLL<Integer>list=new SLL<Integer>();
		
//		1 5 7 3 2 9 4 8 6
		list.insertLast(1);
		list.insertLast(5);
		list.insertLast(7);
		list.insertLast(3);
		list.insertLast(2);
		list.insertLast(9);
		list.insertLast(4);
		list.insertLast(8);
		list.insertLast(6);
//		list.insertLast(-2);



		
		
		SLLNode<Integer>tmp=list.getFirst();
		int max=list.getFirst().element;
		int min=list.getFirst().element;

		while(tmp!=null) {
			if(tmp.element>max) {
				max=tmp.element;
			}
			if(tmp.element<min) {
				min=tmp.element;
			}
			tmp=tmp.succ;
		}
		
		SLL<Integer>pobliskiNajmal=new SLL<Integer>();
		SLL<Integer>pobliskiNajgolem=new SLL<Integer>();
		tmp=list.getFirst();
		
		while(tmp!=null) {
			if(Math.abs(max-tmp.element) < Math.abs(tmp.element-min)){
				pobliskiNajgolem.insertLast(tmp.element);
			}
			else {
				pobliskiNajmal.insertLast(tmp.element);
			}
			tmp=tmp.succ;
			
		}

		System.out.println(pobliskiNajmal);

		System.out.println(pobliskiNajgolem);
		
		
		
		
		
	}

}
