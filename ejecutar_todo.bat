@echo off
echo ========================================
echo  Metodo de Simpson 1/3 - Ejecucion
echo ========================================
echo.

echo [1/4] Ejecutando tests de verificacion...
echo.
amm src/Test.sc
echo.
echo.

echo [2/4] Mostrando ejemplo detallado...
echo.
amm src/Ejemplo.sc
echo.
echo.

echo [3/4] Calculando las 7 integrales...
echo.
amm src/Integrales.sc
echo.
echo.

echo [4/4] Generando reporte de errores...
echo.
amm src/CalculoError.sc
echo.

echo ========================================
echo  Ejecucion completada exitosamente!
echo ========================================
pause

