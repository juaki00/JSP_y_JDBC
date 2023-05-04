<%@ page pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="../css/styles.css">
    <link rel="stylesheet" href="../css/all.css">
    <style>
        .login {
            background: url('./dist/images/login-new.jpeg')
        }
    </style>
    <title>Register</title>
</head>
<body class="h-screen font-sans login bg-cover">
<div class="container mx-auto h-full flex flex-1 justify-center items-center">
    <div class="w-full max-w-lg">
        <div class="leading-loose">
            <form action="/JSP_y_JDBC/nuevo_usuario" method="POST" class="max-w-xl m-4 p-10 bg-white rounded shadow-xl">
                <p class="text-gray-800 font-medium">Register</p>

                <%if (request.getSession().getAttribute("existe") != null) {%>
                <p><%=request.getSession().getAttribute("existe")%>
                </p>
                <%}%>

                <div class="">
                    <label class="block text-sm text-gray-00" for="cus_name">Usuario</label>
                    <input class="w-full px-5 py-1 text-gray-700 bg-gray-200 rounded" id="cus_nick" type="text"
                           name="nick" required="" placeholder="Nombre de usuario" aria-label="Name">
                </div>
                <div class="mt-2">
                    <label class="block text-sm text-gray-600" for="cus_email">Contraseña</label>
                    <input class="w-full px-5  py-4 text-gray-700 bg-gray-200 rounded" id="cus_pass" type="password"
                           name="passwd" required="" placeholder="Contraseña" aria-label="Email">
                </div>
                <div class="">
                    <label class="block text-sm text-gray-00" for="cus_name">Nombre</label>
                    <input class="w-full px-5 py-1 text-gray-700 bg-gray-200 rounded" id="cus_name" type="text"
                           name="nombre" required="" placeholder="Nombre" aria-label="Name">
                </div>
                <div class="mt-2">
                    <label class="block text-sm text-gray-600" for="cus_email">Apellido</label>
                    <input class="w-full px-5  py-4 text-gray-700 bg-gray-200 rounded" id="cus_apellido" type="text"
                           name="apellido" required="" placeholder="Apellido" aria-label="Email">
                </div>
                <div class="mt-2">
                    <label class=" block text-sm text-gray-600" for="cus_email">Telefono</label>
                    <input class="w-full px-2 py-2 text-gray-700 bg-gray-200 rounded" id="cus_tel" type="tel"
                           name="telefono" required="" placeholder="Telefono" aria-label="Email">
                </div>
                <div class="mt-2">
                    <label class="block text-sm block text-gray-600" for="cus_email">Correo electrónico</label>
                    <input class="w-full px-2 py-2 text-gray-700 bg-gray-200 rounded" id="cus_email" type="text"
                           name="email" required="" placeholder="Correo Electrónico" aria-label="Email">
                </div>
                <div class="mt-4">
                    <button class="px-4 py-1 text-white font-light tracking-wider bg-gray-900 rounded" type="submit">
                        Register
                    </button>
                </div>
                <a class="inline-block right-0 align-baseline font-bold text-sm text-500 hover:text-blue-800"
                   href="login.html">
                    Already have an account ?
                </a>
            </form>
        </div>
    </div>
</div>

</body>
</html>