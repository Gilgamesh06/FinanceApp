
![FinanceApp](/Image/Logo/FinanceApp.png)

---

## Historias de Usuario

* **US-01:** Como Usuario quiero poder registrarme en la plataforma.
* **US-02:** Como Usuario quiero poder iniciar sesión en la plataforma.
* **US-03:** Como Usuario quiero poder cerrar sesión en la plataforma.
* **US-04:** Como Usuario quiero poder agregar mis ingresos.
* **US-05:** Como Usuario quiero poder agregar mis egresos.
* **US-06:** Como Usuario quiero poder eliminar mis ingresos.
* **US-O7:** Como Usuario quiero poder eliminar mis egresos.
* **US-08:** Como Usuario quiero poder actualizar mis ingresos.
* **US-09:** Como Usuario quiero poder actualizar mis egresos.
* **US-10:** Como Usuario quiero poder cambiar un ingreso a egresos y viceversa.
* **US-11:** Como Usuario quiero poder ver mi saldo actual y verlo por (dia,semana,mes,año).
* **US-12:** Como Usuario quiero poder colocar metas de ahorro que me alerten cuando el saldo se acerca a esta meta.
* **US-13:** Como Usuario quiero poder eliminar metas de ahorro.
* **US-14:** Como Usuario quiero poder actualizar metas de ahorro.
* **US-15:** Como Usuario quiero poder ver estadisticas de mis ingresos y egresos.

---

  ## Casos de Uso

  * Casos de Uso y Diagramas de Casos de Uso

    ---
    ### Caso de Uso 1: `Registro de Usuario`

    * **Actor:** Usuario
    * **Descripción:** Permite a un usuario registrarse en la plataforma.
    * **Precondiciones:** El usuario no debe estar registrado previamente.
    * **Flujo Principal:**
      * El usuario accede a la página de inicio.
      * El usuario da clic en Register.
      * El usuario ingresa su informacion (nombre, correo electronico, fecha nacimiento, nickname, contraseña).
      * El usuario envia el formulario de registro.
      + El sistema carga el Login.

    ---
    ### Caso de Uso 2: `Inicio de Sesión`

    * **Actor:** Usuario
    * **Descripción:** Permite a un usuario iniciar sesión en la plataforma.
    * **Precondiciones:** El usuario debe estar registrado.
    * **Flujo Principal:**
      * El usuario da clic en login.
      * El usuario ingresa su username y password.
      * El usuario envia las credenciales.
      * El sistema valida las credenciales y carga la interfaz de finanzas.

    ---
    ### Caso de Uso 3: `Cierre de Sesión`

    * **Actor:** Usuario
    * **Descripción:** Permite a un usuario cerrar sesión de la plataforma.
    * **Precondiciones:** El usuario debe estar autenticado.
    * **Flujo Principal:**
      * El usuario selecciona la opcion salir.
      * El sistema cierra la sesión del usuario.
      * El sistema carga la pagina de inicio.

    ---
    ### Caso de Uso 4: `Crear Ingreso`

    * **Actor:** Usuario
    * **Descripción:** Permite a un usuario crear un ingreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usuario debe estar autenticado.
    * **Flujo Principal:**
      * El usuario seleciona la opcion de crear ingreso.
      * El sistema cargar el formulario para crear ingreso.
      * El usuario ingresa (tipo,categoria,valor,fecha).
      * El usuario envia el formulario.
      * El sistema guarda la informacion y retorna el ingreso generado.

    ---
    ### Caso de Uso 5: `Crear Egreso`

    * **Actor:** Usuario
    * **Descripcion:** Permite a un usuario crear un egreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usuario debe estar autenticado.
    * **Flujo Principal:**
      * El usuario seleciona la opcion de crear ingreso.
      * El sistema carga el formulario para crear ingreso.
      * El usuario ingresa (tipo,categoria,valor,fecha).
      * El usuario envia el formulario.
      * El sistema guarda la informacion y retorna el egreso generado.

    ---
    ### Caso de Uso 6: `Eliminar Ingreso`

    * **Actor:** Usuario
    * **Descripcion:** Permite a un usuario eliminar un ingreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usuario debe estar autenticado.
      * Debe existir el ingreso a eliminar.
    * **Flujo Principal:**
      * El Usuario selecciona el ingreso a eliminar.
      * El Usuario selecciona la opcion de eliminar.
      * El sistema elimina el ingreso y notifica al usuario.

    ---
    ### Caso de Uso 7: `Eliminar Egreso`

    * **Actor:** Usuario
    * **Descripcion:** Permite a un usuario eliminar un egreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usuario debe estar autenticado.
      * Debe existir el egreso a eliminar.
    * **Flujo Principal:**
      * El Usuario selecciona el egreso a eliminar.
      * El Usuario selecciona la opcion de eliminar.
      * El sistema elimina el egreso y notifica al usuario.

    ---
    ### Caso de Uso 8: `Actualizar Ingreso`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario actualizar un ingreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
      * Debe existir el ingreso a actualizar.
    * **Flujo Principal:**
      * El usuario selecciona el ingreso a actualizar.
      * El usuario selecciona la opcion de actualizar.
      * El sistema cargar el formulario de actualizacion.
      * El usuario modifica los campos.
      * El usuario da click en Actualizar Ingreso.
      * El sitema actualiza el ingreso y lo renderiza.

    ---
    ### Caso de Uso 9: `Actualizar Egreso`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario actualizar un egreso.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
      * Debe existir el egreso a actualizar.
    * **Flujo Principal:**
      * El usuario selecciona el egreso a actualizar.
      * El usuario selecciona la opcion de actualizar.
      * El sistema cargar el formulario de actualizacion.
      * El usuario modifica los campos.
      * El usuario da click en Actualizar egreso.
      * El sitema actualiza el egreso y lo renderiza.

    ---
    ### Caso de Uso 10: `Actualizar Estado`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario cambiar el estado de ingreso a egreso y viceversa.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
      * Debe existir el egreso o ingreso a cambiar.
    * **Flujo Principal:**
      * El usuario selecciona el ingreso o egreso a actualizar.
      * El usuario selecciona la opcion de cambiar.
      * El sistema cambia de ingreso a egreso o viceversa.

    ---
    ### Caso de Uso 11: `Saldo`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario ver su saldo y filtrarlo por fecha.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
    * **Flujo Principal:**
      * El usuario inicia sesión.
      * El sistema cargar el saldo actual.
      * El sistema carga opciones de filtrado (dia,semana,mes,año)
      * El usuario selecciona una opcion.
      * El sistema carga el saldo de la respectiva fecha.

    ---
    ### Caso de Uso 12: `Crear Meta de Ahorro`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario crear una meta de ahorro.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
    * **Flujo Principal:**
      * El usuario seleciona crear meta de ahorro.
      * El sistema carga el formulario para crear una meta de ahorro.
      * El usuario le da en crear.
      * El sistema crea la meta de ahorro.
      * El sistema genera alertas que se hayan definido al crear la meta de ahorro.

    ---
    ### Caso de Uso 13: `Eliminar Meta de Ahorro`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario crear una meta de ahorro.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
      * Debe existir la meta de ahorro a eliminar
    * **Flujo Principal:**
      * El usuario seleciona en meta de ahorros.
      * El usuario seleciona la meta de ahorro a eliminar.
      * El usuario seleciona eliminar.
      * El sistema elimina la meta de ahorro y notifica.

    ---
    ### Caso de Uso 14: `Actualizar Meta de Ahorro`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario crear una meta de ahorro.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
      * Debe existir la meta de ahorro a actualizar
    * **Flujo Principal:**
      * El usuario seleciona en meta de ahorros.
      * El usuario seleciona la meta de ahorro a actualizar.
      * El usuario seleciona actualizar.
      * El sistema carga el formulario de actualizacion de meta de ahorro.
      * El usuario envia el formulario.
      * El sistema actualiza la meta de ahorro y la renderiza.

    ---
    ### Caso de Uso 14: `Estadisticas`

    * **Actor:** Usuario.
    * **Descripcion:** Permite a un usuario ver las estadisticas de sus ingresos y egresos.
    * **Precondiciones:**
      * El usuario debe estar registrado.
      * El usaurio debe estar autenticado.
    * **Flujo Principal:**
      * El usuario seleciona la opcion estadisticas.
      * El sistema carga las estadisticas de ingresos y egresos.

    ### Diagrama de casos de Uso

    ![Use Case](/Diagram/UseCase/UseCase.png)
