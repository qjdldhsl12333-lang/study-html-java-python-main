// 데이터는 script.js와 동일하게 여기에 다시 정의해야 합니다.
// (실제 웹 개발에서는 서버 API를 통해 데이터를 가져옵니다.)
const accounts = [ //오늘 수업에서 배웠던 Json을 활용
    {
        name: "봉하운",
        age: 29,
        address: ["경기도", "부천시", "원미로 13-1"],
        id: "qjdldhsl123",
        password: "gkdnsqwer1234"
    },
    {
        name: "김재벌",
        age: 30,
        address: ["인천광역시", "구월동"],
        id: "woqjf123",
        password: "woqjf123123"
    },
    {
        name: "여준협",
        age: 28,
        address: ["인천광역시", "구월동"],
        id: "wnsguq123",
        password: "wnsguq123123"
    }
];

// DOM 요소 선택
// 역시 여기도 getElementById 를 사용
const userNameInput = document.getElementById('userName'); 
const userAgeInput = document.getElementById('userAge');
const findButton = document.getElementById('findButton');
const messageArea = document.getElementById('messageArea');

// 메시지 표시 콜백함수 기존 파일과 동일하다
function displayMessage(message, isSuccess) {
    messageArea.textContent = message;
    messageArea.classList.remove('success', 'error');
    if (isSuccess) {
        messageArea.classList.add('success');
    } else {
        messageArea.classList.add('error');
    }
    messageArea.style.display = 'block';
}

// 계정 찾기 처리 함수 (AI영역... 보강이 필요할듯하다 너무 어려워요 ㅠㅠ)
function handleFindAccount() {
    const inputName = userNameInput.value;
    // 나이 입력값은 문자열이므로 숫자로 변환합니다.
    const inputAge = parseInt(userAgeInput.value, 10); 

    // 이름과 나이가 모두 일치하는 사용자 찾기
    const foundUser = accounts.find(account => {
        return account.name === inputName && account.age === inputAge;
    });

    if (foundUser) {
        // 실제로는 비밀번호 전체를 보여주지 않고 재설정 링크를 이메일로 보냅니다.
        // 여기서는 예시로 아이디와 비밀번호 힌트를 보여줍니다.
        const message = `계정을 찾았습니다! 아이디: ${foundUser.id}, 비밀번호 힌트: ${foundUser.password.substring(0, 4)}****`;
        displayMessage(message, true);
    } else {
         // 일치하는 사용자가 없을 경우
        displayMessage("입력된 정보와 일치하는 계정을 찾을 수 없습니다.", false);
    }
}

// 이벤트 리스너 추가 버튼 클릭하면 발동!!!!
findButton.addEventListener('click', handleFindAccount);
