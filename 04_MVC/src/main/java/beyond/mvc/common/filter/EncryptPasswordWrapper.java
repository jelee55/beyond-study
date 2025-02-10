package beyond.mvc.common.filter;

import beyond.mvc.common.util.EncryptUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

// 사용자의 요청 정보를 변경하는 Wrapper 클래스
public class EncryptPasswordWrapper extends HttpServletRequestWrapper {

    public EncryptPasswordWrapper(HttpServletRequest request) {
        super(request);
    }

    @Override
    public String getParameter(String name) {
        // 클라이언트가 전달하는 name 값 중에 userPwd 값만 암호화 처리하고 나머지는 정상적으로 반환하도록 구현
        if (name.equals("userPwd")) {
            // 암호화 처리 후 반환
            return EncryptUtil.oneWayEnc(super.getParameter(name), "SHA-256");
        }
        return super.getParameter(name);
    }
}
