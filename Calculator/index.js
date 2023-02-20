// console.log("Hello world");
// alert(4+5);


let buffer = '0';
let previousOperator=null;
let runningTotal = 0;
const screen = document.querySelector('.screen');

function buttonClick(value){
    if(isNaN(parseInt(value))){
        handleSymbol(value);
    }else{
        handleNumber(value);
    }
    render();
}


function handleNumber(value){
    if(buffer==='0'){
        buffer=value;
    }else{
        buffer+= value;
    }
    
}

function handleSymbol(value){
    switch(value){
        case 'C':
            buffer = '0';
            break;
        case '=':
                if(previousOperator === null){
                    return;
                }

                flushOperation(parseInt(buffer));
                previousOperator=null;
                buffer = +runningTotal;
                runningTotal=0;
                break;
        
            case '←':
                if(buffer.length===1){
                    buffer='0';
                }else{
                    buffer = buffer.substring(0,buffer.length-1);
                }

                case '+':
        case '-':
        case '*':
        case '/':
            handleMath(value);
            break;
                break;
            default :
            console.log("wrong click");
    }
}

function handleMath(value){
    if(buffer==='0'){
        return;
    }

    const intBuffer = parseInt(buffer);

    if(runningTotal ===0){
        runningTotal = intBuffer;
    }else{
        flushOperation(intBuffer);
    }

    previousOperator = value;
    buffer = '0';
}


function flushOperation(intBuffer){
    if(previousOperator === '+'){
        runningTotal += intBuffer;
    }else if(previousOperator === '-'){
        runningTotal -= intBuffer;
    }else if(previousOperator === '*'){
        runningTotal *= intBuffer;
    }else if(previousOperator === '/'){
        runningTotal /= intBuffer;
    }
}
function init(){
    console.log("Hi");
    document.querySelector('.buttons-cls').addEventListener("click",function(event){
        buttonClick(event.target.innerText);
    });
}


function render(){
screen.innerText = buffer;
}

init();