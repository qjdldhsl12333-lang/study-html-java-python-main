

//서버의 주소와 포트를 명시한다.
export const BASE_URL = 'http://localhost:8080';

//범용 API fetch 함수 응답 상태를 확인하고 .JSON 데이터를 파싱하여 변환
export async function apiFetch(endpoint, Options = {}) {
    const url = BASE_URL + endpoint;
    try {
        //fetch()요청을 한다.
        const response = await fetch(url, Options);
        //응답 본문을 JSON으로 파싱한다.
        const result = await response.json();
        //response.ok ->http 상태코드가 통신이 성공하면 true를 반환 400~,500~ false반환
        //http 상태 코드가 200이 아니면 에러로 처리
        //errorMessage에는 서버에서 보낸 에러 문구를 넣어주시면 됩니다.
        //throw new Error(errorMessage)
        if (!response.ok) {
            //ResponseDTO의 error 필드에 에러 메시지를꺼낸다
            const errorMessage = result.error;
            //통신이 잘 되지 않으면 예외를 발생
            throw new Error(errorMessage);
        }
        //성공시 응답DTO의 data필드를 반환
        return result.data;
    } catch (error) {
        console.error("API 호출 중 오류 발생 :" + error.message);
        throw error; //함수를 호출한쪽에서 예외를 처리
    }
}

