<!doctype html>
<html lang="en">

<head>
  <title>Login | Tailwind Admin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link rel="stylesheet" href="../css/styles.css">
  <link rel="stylesheet" href="../css/all.css">
  <style>
    .login{
      background: url('./dist/images/login-new.jpeg')
    }
  </style>
</head>

<body class="h-screen font-sans login bg-cover">
<div class="container mx-auto h-full flex flex-1 justify-center items-center">
  <div class="w-full max-w-lg">
    <div class="leading-loose">
      <form action="/JSP_y_JDBC/servlet-login" method="POST" class="max-w-xl m-4 p-10 bg-white rounded shadow-xl">
        <p class="text-gray-800 font-medium text-center text-lg font-bold">Login</p>
        <div class="">
          <label class="block text-sm text-gray-00" for="username">Usuario</label>
          <input class="w-full px-5 py-1 text-gray-700 bg-gray-200 rounded" id="username" name="usuario type="text" required="" placeholder="User Name" aria-label="username">
        </div>
        <div class="mt-2">
          <label class="block text-sm text-gray-600" for="password">Contraseña</label>
          <input class="w-full px-5  py-1 text-gray-700 bg-gray-200 rounded" id="password" name="contrasena" type="password" required="" placeholder="*******" aria-label="password">
        </div>
        <div class="mt-4 items-center justify-between">
          <button class="px-4 py-1 text-white font-light tracking-wider bg-gray-900 rounded" type="submit">Iniciar sesion</button>
          <a class="inline-block right-0 align-baseline  font-bold text-sm text-500 hover:text-blue-800" href="#">
            Forgot Password?
          </a>
        </div>
        <a class="inline-block right-0 align-baseline font-bold text-sm text-500 hover:text-blue-800" href="#">
          Not registered ?
        </a>
        <%if(request.getAttribute("error")!=null){%>
        <p><%=request.getAttribute("error")%></p>
        <%}%>
      </form>

    </div>
  </div>
</div>
</body>

</html>