setFinalPrice();


//총 가격 계산 하는 함수 
function setFinalPrice() {
    //체크 된 장바구니 상품의 총 가격을 모두 더해서 계산
    //클래스가 chk인 태그 중에서 체크가 된 태그만 선택
    const chks = document.querySelectorAll('.chk:checked');

    let finalPrice = 0;
    chks.forEach(function (chk, i) {
        //chk 각각의 같은 행에 있는 총 가격 데이터 찾아 가기
        const strPrice = chk.closest('tr').children[5].textContent;


        //정규식을 사용 해서 쉼표와 원화 표시를 제거
        const regex = /[^0-9]/g;
        const price = parseInt(strPrice.replace(regex, ''));

        finalPrice += price;
    });

    document.querySelector('#finalPrice-span').textContent = '￦ ' + finalPrice.toLocaleString() + '원';

}

//제목줄 체크박스 체크 및 해제 시 모든 체크박스 체크 및 해제 
function checkAll() {
    const chkAll = document.querySelector('#chkAll');
    const chks = document.querySelectorAll('.chk');

    if (chkAll.checked) {
        for (const chk of chks) {
            chk.checked = true;
        }
    }
    else {
        for (const chk of chks) {
            chk.checked = false;
        }
    }
    setFinalPrice();
}

function goDelete(cartCode) {
    if (confirm('상품을 장바구니에서 삭제하시겠습니까?')) {
        location.href = `/cart/delete?cartCode=${cartCode}`;
    }
}

function updateCnt(updateCnt, cartCode) {
    // ------------------- 첫번째 방식 ---------------//
    fetch('/cart/updateCnt', { //요청경로
        method: 'POST',
        cache: 'no-cache',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'
        },
        //컨트롤러로 전달할 데이터
        body: new URLSearchParams({
            // 데이터명 : 데이터값
            'cartCnt' : updateCnt.parentElement.previousElementSibling.querySelector('input').value,
            'cartCode' : cartCode
        })
    })
        .then((response) => {
            if (!response.ok) {
                alert('fetch error!\n컨트롤러로 통신중에 오류가 발생했습니다.');
                return;
            }

            return response.text(); //컨트롤러에서 return하는 데이터가 없거나 int, String 일 때 사용
            //return response.json(); //나머지 경우에 사용
        })
        //fetch 통신 후 실행 영역
        .then((data) => {//data -> controller에서 리턴되는 데이터!

        })
        //fetch 통신 실패 시 실행 영역
        .catch(err => {
            alert('fetch error!\nthen 구문에서 오류가 발생했습니다.\n콘솔창을 확인하세요!');
            console.log(err);
        });
}