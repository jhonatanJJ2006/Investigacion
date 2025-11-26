# 🚀 Instrucciones para Subir el Proyecto a GitHub

## Paso 1: Crear Repositorio en GitHub

1. Ve a [GitHub.com](https://github.com) e inicia sesión
2. Haz clic en el botón **"+"** (arriba a la derecha) → **"New repository"**
3. Configura el repositorio:
   - **Repository name:** `simpson-scala-higher-order-functions`
   - **Description:** `Implementación del Método de Simpson 1/3 usando Higher Order Functions en Scala`
   - **Visibility:** Public
   - **NO** marques "Add a README file" (ya tenemos uno)
4. Haz clic en **"Create repository"**

---

## Paso 2: Inicializar Git Local (Primera vez)

Abre una terminal en la carpeta del proyecto y ejecuta:

```bash
# Inicializar repositorio Git
git init

# Agregar todos los archivos
git add .

# Hacer el primer commit
git commit -m "feat: Implementación inicial del Método de Simpson 1/3 con Higher Order Functions"

# Renombrar rama principal a 'main'
git branch -M main

# Conectar con GitHub (REEMPLAZA 'tu-usuario' con tu usuario de GitHub)
git remote add origin https://github.com/tu-usuario/simpson-scala-higher-order-functions.git

# Subir el código
git push -u origin main
```

---

## Paso 3: Crear la Wiki del Repositorio

1. Ve a tu repositorio en GitHub
2. Haz clic en la pestaña **"Wiki"**
3. Haz clic en **"Create the first page"**
4. Copia y pega el contenido del archivo `WIKI.md`
5. Guarda la página

---

## Paso 4: Agregar Topics (Etiquetas)

1. En la página principal del repositorio, haz clic en el ⚙️ junto a "About"
2. En "Topics", agrega:
   - `scala`
   - `functional-programming`
   - `higher-order-functions`
   - `simpson-rule`
   - `numerical-integration`
   - `university-project`
3. Guarda los cambios

---

## Paso 5: Verificar la Estructura

Tu repositorio debe tener esta estructura:

```
simpson-scala-higher-order-functions/
│
├── src/
│   ├── Simpson.sc
│   ├── Integrales.sc
│   ├── CalculoError.sc
│   └── Ejemplo.sc
│
├── .gitignore
├── README.md
├── WIKI.md
├── INSTRUCCIONES_GITHUB.md
└── ejecutar_todo.bat
```

---

## Paso 6: Presentar al Docente

### Preparar la Presentación

1. **Abre el repositorio** en tu navegador
2. **Ejecuta el código** antes de la presentación:
   ```bash
   amm src/CalculoError.sc
   ```
3. **Ten listo**:
   - El README abierto en GitHub
   - La Wiki del repositorio
   - Un terminal para ejecutar los scripts

### Puntos Clave a Explicar

1. **¿Qué es una Higher Order Function?**
   - Muestra la firma de `integracion`
   - Explica que recibe una función como parámetro

2. **¿Cómo funciona el Método de Simpson?**
   - Ejecuta `src/Ejemplo.sc` para mostrar paso a paso
   - Explica la fórmula matemática

3. **Resultados**
   - Muestra la salida de `src/CalculoError.sc`
   - Comenta sobre la precisión obtenida

4. **Ventajas de la Programación Funcional**
   - Una función sirve para infinitas funciones matemáticas
   - Código más limpio y reutilizable

---

## Comandos Git Útiles

### Hacer cambios adicionales

```bash
# Ver el estado
git status

# Agregar archivos modificados
git add .

# Hacer commit
git commit -m "docs: Actualizar documentación"

# Subir cambios
git push
```

### Ver historial

```bash
git log --oneline
```

### Clonar en otra computadora

```bash
git clone https://github.com/tu-usuario/simpson-scala-higher-order-functions.git
```

---

## 📋 Checklist Final

Antes de presentar, verifica que:

- [ ] El repositorio está público en GitHub
- [ ] El README.md se ve correctamente
- [ ] La Wiki está creada con el contenido de WIKI.md
- [ ] Los topics están agregados
- [ ] Puedes ejecutar los scripts localmente
- [ ] Has probado todos los archivos .sc
- [ ] El .gitignore está presente

---

## 💡 Consejos para la Presentación

1. **Sé conciso:** Enfócate en los conceptos clave (HOF, Simpson)
2. **Muestra código ejecutándose:** Es más impactante que solo hablar
3. **Explica los errores:** Demuestra que entiendes la precisión del método
4. **Menciona ventajas:** Reutilización, abstracción, composición

---

## 🆘 Solución de Problemas

### Error: "remote origin already exists"

```bash
git remote remove origin
git remote add origin https://github.com/tu-usuario/simpson-scala-higher-order-functions.git
```

### Error: "Permission denied"

Verifica que:
1. Estás autenticado en GitHub
2. El usuario en la URL es correcto
3. Tienes permisos de escritura en el repositorio

### Error al ejecutar scripts Scala

```bash
# Instalar Ammonite si no lo tienes
winget install --id=lihaoyi.Ammonite -e
```

---

¡Éxito con tu presentación! 🎓

