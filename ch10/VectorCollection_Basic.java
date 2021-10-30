java.util.Vecotr;
// 벡터 생성
Vector<Integer> v = new Vector<Integer>(7);

// 요소 삽입
v.add(5);
v.add(4);
v.add(-1);

//요소 개수(n)와 용량(c) 
int n = v.size();
int c = v.capacity();

//요소 중간 삽입, v.size 보다 큰 곳에 삽입 불가능!
v.add(2, 100);  

//요소 얻어내기
Integer obj = v.get(1); // or int i = v.get(i);
int i = obj.intValue(); // or int i = obj;

//요소 삭제
v.remove(1);

//마지막 요소
int last = v.lastElement();

//모든 요소 삭제
v.removeAllElements();
