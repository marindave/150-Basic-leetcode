/**
 * @return {Function}
 */
 /** 
    function createHelloWorld(){
    return function(){
        return "Hello World";
    }
}
const f=createHelloWorld();
f();
*/
var createHelloWorld=function(){
    return function(){
        return "Hello World";
    }
}
 //var createHelloWorld=()=>()=>"Hello Wolrd";

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */