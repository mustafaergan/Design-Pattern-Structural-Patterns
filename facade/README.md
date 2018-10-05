Alt sistemlerin direkt olarak kullanılması yerine alt sistemdeki nesneleri kullanan başka bir nesne üzerinden kullanılmasını sağlayan tasarım desenidir.


JAVA:

javax.faces.context.FacesContext uses LifeCycle, ViewHandler, NavigationHandler classes under the hood, but most clients are not aware of that.


javax.faces.context.ExternalContext uses ServletContext, HttpSession, HttpServletRequest,  HttpServletResponse and others inside.