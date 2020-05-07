// 변수의 유효범위
// scope

// const, let 의 유효범위
//  ==> Block Scope
//    { ... }


//블럭
{
    const name = "Mark"
    console.log(`name= ${name}`)

}
// 블럭 밖에서 사용하려 하면 에러
// console.log(`name= ${name}`)

{
    // console.log (`naem = `,name2)    // 초기화 안되었다고 에러!
    // const name2 = 'Mark'
}

// {
//     console.log(value1)
//     var value1 = 200;
//     console.log(value2)
// }

// Hoisting
// https://developer.mozilla.org/ko/docs/Glossary/Hoisting

// 이러한 현상을 hoisting 이라 하는데
// hoisting 현상은 함수에서만 발생하는게 아니다.

// hoising 
// 아래에 있는 선언을(만) 끌어올린다.

// hoising 때문에 동작의 오류처럼 보이는 증상 겪게 됨

// hoising 현상은 처음부터 있었으나
// 용어 자체는 ES2015 및 그 이전에는 사용되지 않음


{
    console.log(`nick=${nick}`)

    nick = 'Mighty';
    console.log(`nick=${nick}`)
    var nick = '아이언맨'
}

age = 6;
age++;
console.log('age = ', age)
{
    console.log(`age = ${age}`)
    age = 30
    console.log(`age ${age}`)
    // var age; // var 는 hoisting 발생
    let age;    // let 은 hoisting 이 발생 안한다.
}

console.log('4.age =', age)