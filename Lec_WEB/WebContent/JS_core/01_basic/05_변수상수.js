// var, let ,const

var a = 100;
console.log('=',a)
a=200
console.log('=',a)

// 중복선언 가능 
var a = 500;
console.log('=',a)

//ES6 부터 let,const 로 변수 상수 지정.
let value = 177;
console.log('value=',value);
value = 555;
console.log('value=',value);

// let 은 중복선언 불가
// let value = 277;
// console.log('value=',value);

// 상수 선언
const b = 1;
console.log('b=',b)

// 오류 final 과 비슷한놈
// b = 2;
// console.log('b=',b)

//=======================================================
// var 는 오늘날 js 환경에서는 그닥 권장하진 않음.
// var 와 let
// IE9, IE10  와 같은 구형 브라우저에서는
//  let, const 를 사용 못함.

// 개발 단계에서는 '바벨' 등을 사용하여
// 우리가 개발한 코드가 구형 브라우저 에서동 동작케 함.

let c; // 초기화를 따로 해도 가능.
c = 100;

// back tick
console.log(`b = ${c}`);    // Template Literal (ES6 <= )

let value2 = 100;
console.log(value2, typeof value2);     // typeof 연산자 : 변수의
console.log(value2, typeof (value2));   // JS 는 대입되는 값에 따라 '타입' 바뀜.

value2 = 'hello';   // string 타입
console.log(value2, typeof value2);
