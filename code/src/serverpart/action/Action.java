package serverpart.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This interface stores execute methods for work with http requests.
 */
public interface Action {

    /**
     * This method executes some action with http request.
     *
     * @param request  value of the object HttpServletRequest
     * @param response value of the object HttpServletResponse
     * @throws IOException      throw IOException
     * @throws ServletException throw ServletException
     */
    void execute(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException;

}