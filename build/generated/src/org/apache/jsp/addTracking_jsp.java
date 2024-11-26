package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addTracking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>Adding Tracking....</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .header___1FxHS.fixed___3SAJN {\n");
      out.write("                position: fixed;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header___1FxHS {\n");
      out.write("                left: 0;\n");
      out.write("                position: absolute;\n");
      out.write("                width: 100%;\n");
      out.write("                z-index: 101;\n");
      out.write("                top: 0;\n");
      out.write("                transition: transform .2s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header-desktop___3T36B {\n");
      out.write("                display: block;\n");
      out.write("                background-color: #000;\n");
      out.write("            }\n");
      out.write("            .glass-header-top-white___3LWiN {\n");
      out.write("                font-family: \"Roboto\",Helvetica, Arial, sans-serif;\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 11px;\n");
      out.write("                display: block;\n");
      out.write("                background: #000;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                transform: translateY(0);\n");
      out.write("                will-change: transform;\n");
      out.write("                transition: transform 400ms;\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 100;\n");
      out.write("                margin-left: 100px;\n");
      out.write("            }\n");
      out.write("            .glass-header-top-white___3LWiN .inner___1T3DW {\n");
      out.write("                align-items: center;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: flex-end;\n");
      out.write("                height: 32px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .glass-header-top-white___3LWiN .inner___1T3DW a {\n");
      out.write("                padding: 0 10px;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 100%;\n");
      out.write("                text-transform: lowercase;\n");
      out.write("                text-decoration: none;\n");
      out.write("                -webkit-font-smoothing: antialiased;\n");
      out.write("                cursor: pointer;\n");
      out.write("                color: #fff;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .glass-header-bottom-desktop-white___38y1Y {\n");
      out.write("                height: 48px;\n");
      out.write("                padding-top: 0;\n");
      out.write("                background-color: #000;\n");
      out.write("                color: #fff;\n");
      out.write("\n");
      out.write("                transform: translateY(0);\n");
      out.write("                transition: 400ms transform;\n");
      out.write("                will-change: transform;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("            .glass-header-bottom-desktop-white___38y1Y .inner___2IOZ- {\n");
      out.write("                max-width: none;\n");
      out.write("                padding: 0 20px;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                position: relative;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .inner___2IOZ- {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                display: flex;\n");
      out.write("                height: 100%;\n");
      out.write("                max-width: 1220px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                padding: 0 16px;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .glass-header-bottom-desktop-white___38y1Y .inner___2IOZ- .main-menu___1xu8m {\n");
      out.write("                display: flex;\n");
      out.write("                padding-left: 40px;\n");
      out.write("                flex: 1;\n");
      out.write("            }\n");
      out.write("            .main-menu___1xu8m {\n");
      out.write("                flex: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .glass-navigation-flyout-white___20EjX {\n");
      out.write("                display: inline-block;\n");
      out.write("                height: 45px;\n");
      out.write("                margin-top: 3px;\n");
      out.write("                background-color: #000;\n");
      out.write("                color: #fff;\n");
      out.write("                -webkit-user-select: none;\n");
      out.write("                -moz-user-select: none;\n");
      out.write("                -ms-user-select: none;\n");
      out.write("                user-select: none;\n");
      out.write("                margin-right: 20px;\n");
      out.write("                width: -webkit-max-content;\n");
      out.write("                width: -moz-max-content;\n");
      out.write("                width: max-content;\n");
      out.write("            }\n");
      out.write("            .glass-navigation-flyout-white___20EjX a.label {\n");
      out.write("                position: relative;\n");
      out.write("                letter-spacing: 1.87px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                -webkit-font-smoothing: antialiased;\n");
      out.write("                font-family: \"Roboto\",Helvetica, Arial, sans-serif;\n");
      out.write("                font-weight: 400;\n");
      out.write("                font-size: 36px;\n");
      out.write("                line-height: 45px;\n");
      out.write("                margin: 0 3px;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("            .logo-black___30Qp_ {\n");
      out.write("                width: 50px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: row;\n");
      out.write("                flex-shrink: 0;\n");
      out.write("                align-items: center;\n");
      out.write("                background-image: url(https://i.ibb.co/MPs9fd4/logodaddy.jpg);\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: left center;\n");
      out.write("                background-size: contain;\n");
      out.write("                transition: top .45s ease;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .row.main{\n");
      out.write("                margin-top: 80px;\n");
      out.write("            }\n");
      out.write("            .logo-black___30Qp_.big___2Azet {\n");
      out.write("                width: 70px;\n");
      out.write("                top: -15px;\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*            main body*/\n");
      out.write("            /* Style the header */\n");
      out.write("\n");
      out.write("            /* Container for flexboxes */\n");
      out.write("            .row {\n");
      out.write("                display: -webkit-flex;\n");
      out.write("                display: flex;\n");
      out.write("                border-style: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Create three unequal columns that sits next to each other */\n");
      out.write("            .column {\n");
      out.write("                padding: 20px;\n");
      out.write("                /* Should be removed. Only for demonstration */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Left and right column */\n");
      out.write("            .col-3.side {\n");
      out.write("\n");
      out.write("                background-color: #3C1321;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* Style the footer */\n");
      out.write("            .footer {\n");
      out.write("                background-color: #000;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            label.trackingheader{\n");
      out.write("                padding: 20px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"header___1FxHS fixed___3SAJN\">\n");
      out.write("            <div class=\"header-desktop___3T36B\">\n");
      out.write("                <div class=\"glass-header-top-white___3LWiN\">\n");
      out.write("                    <div class=\"inner___1T3DW\">\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/profilereg.jsp\">POPCORN_212</a>\n");
      out.write("                        <a>logout</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"glass-header-bottom-desktop-white___38y1Y\">\n");
      out.write("                    <div class=\"inner___2IOZ-\">\n");
      out.write("                        <a class=\"logo-black___30Qp_ big___2Azet\" href=\"#\">\n");
      out.write("                        </a>\n");
      out.write("                        <div class=\"main-menu___1xu8m\">\n");
      out.write("                            \n");
      out.write("                            <div class=\"glass-navigation-flyout-white___20EjX\">\n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath());
      out.write("/item.jsp\" class=\"label\">HOMEPAGE</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"glass-navigation-flyout-white___20EjX\">\n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath());
      out.write("/checkTracking.jsp\" class=\"label\">TRACKING</a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row main\">\n");
      out.write("            <div class=\"col-3 side\"></div>\n");
      out.write("            <div class=\"col-6\">\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        <table border=\"0\">\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td><input type=\"hidden\" name=\"date\" value=\"");
      out.print( (new java.sql.Date(System.currentTimeMillis()).toString()));
      out.write("\" size=\"40\"></td>\n");
      out.write("                            </tr> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <input class=\"btn btn-dark\" type=\"submit\" name=\"submit\" value=\"Submit\">\n");
      out.write("                                </td>\n");
      out.write("                            </tr>                     \n");
      out.write("                            </tbody>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 side\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function numberOnly() {\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>&copy daddy-e-shoes</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <form  action=\"update\" method=\"post\">\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <form   action=\"insert\" method=\"post\">\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <input type=\"text\" name=\"id\"  readonly value=\"");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\" />\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td>Product ID: </td>\n");
        out.write("                                    <td><input type=\"text\" name=\"productid\" value=\"");
        if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
          return true;
        out.write("\" size=\"40\"></td>\n");
        out.write("                                </tr>\n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td>Is ready to checkout.</td>\n");
        out.write("                                    <td><input type=\"hidden\" name=\"status\" value=\"Order Received\" size=\"40\"></td>\n");
        out.write("                                </tr> \n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("\n");
        out.write("                                    <td><input type=\"hidden\" name=\"location\" value=\"Not Available\" size=\"40\"></td>\n");
        out.write("                                </tr> \n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td>Status: </td>\n");
        out.write("                                    <td><input type=\"text\" name=\"status\" value=\"");
        if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\" size=\"40\"></td>\n");
        out.write("                                </tr> \n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("                                    <td>Location: </td>\n");
        out.write("                                    <td><input type=\"text\" name=\"location\" value=\"");
        if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\" size=\"40\"></td>\n");
        out.write("                                </tr> \n");
        out.write("\n");
        out.write("                                <tr>\n");
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking.status}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tracking.location}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
