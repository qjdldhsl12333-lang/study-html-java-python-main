// 1. 데이터 정의 (이전과 동일)
// 내 친구들이랑 내 정보를 간단하게 넣어보았다.
// json데이터를 먼저 만들었다. 솔직히 데이터 이외에는 너무 어려웠다.
//  거의 컨닝수준...ㅎㅎ
const accounts = [
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

// 2. DOM 요소 선택 , querySelector랑 getElementById
// 이 두가지의 차이점을 이용해 봤다. 
// 처음에 솔직히 무지성으로 querySelector를 사용했다가.
// getElementById가 querySelector보다 빠르다는 장점을 가지고 있길래 
// 나중에 다른 메커니즘을 추가할것을 생각해서 getElementById를 사용했다.
const userIdInput = document.getElementById('userId'); // 아이디 입력창
const userPasswordInput = document.getElementById('userPassword');  // 비밀번호 입력창
const loginButton = document.getElementById('loginButton'); // 로그인 버튼
const messageArea = document.getElementById('messageArea'); // 메시지 출력 영역

// 3. 메시지 표시 콜백 함수 
// (콜백 함수는 너무 헷갈려서 강의 내용 구조 가져다놓고 AI돌리면서 수정했다;;;)
// isSuccess의 타입은 boolean형이기 때문에 카멜식표현법을 사용
 function displayMessage(message, isSuccess) {
    messageArea.textContent = message; // 메세지 내용 설정!
    // 기존 클래스 제거 후 성공/실패에 따라 클래스 추가 (CSS 스타일 적용용)
    messageArea.classList.remove('success', 'error');
    if (isSuccess) {
        messageArea.classList.add('success');
    } else {
        messageArea.classList.add('error');
    }
    messageArea.style.display = 'block'; // 숨겨져 있던 메시지 영역 보이게 함
}

// 4. 로그인을 담당하는 콜백 함수
function handleLogin() {
    const inputId = userIdInput.value; //아이디 입력 값을 가져온다
    const inputPassword = userPasswordInput.value; //비밀번호 입력 값을 가져온다.

    // account 에 입력된 ID랑 비교해 user를 찾는다
    const user = accounts.find(account => account.id === inputId);

    if (!user) {
        displayMessage("❌ 로그인 실패: 존재하지 않는 아이디입니다.", false);
        return;
    }

    if (user.password === inputPassword) {
        // 로그인 완료하면 true, 실패하면 false
        // 로그인 완료 시 메시지 출력
        displayMessage(`✅ 로그인 완료! 어서오세요 ${user.name}님.`, true);
    } else {// 실패하면 요로케
        displayMessage("❌ 로그인 실패: 비밀번호가 올바르지 않습니다.", false);
    }
}

// 5. 이벤트 리스너 추가
// 로그인 버튼을 누르면 위의 함수가 실행된다...
// 머리터지겄다.. ㅎㅎ
// 이벤트리스너는 기억해냈다.!! 단지,
//  loginButton을 착각해서 그냥 button 넣고 왜 안되지... 이러고 있었을뿐...
// const에 설정해놓고... 바보짓함 
loginButton.addEventListener('click', handleLogin);
