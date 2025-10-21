# Guía rápida: Instalar y usar Haskell en VSCode

Esta guía te ayudará a configurar un entorno funcional de **Haskell** con **Stack**, **GHCup** y **VSCode**, usando el **Haskell Language Server (HLS)** para debug.

---

## 🪜 1. Instalar GHCup (el gestor oficial de Haskell)

GHCup administra **GHC**, **Stack**, **Cabal** y **Haskell Language Server**.

```bash
curl --proto '=https' --tlsv1.2 -sSf https://get-ghcup.haskell.org | bash
```

Luego sigue las instrucciones del instalador (recomendado aceptar agregarlo al PATH).

> 🔁 Cierra y vuelve a abrir la terminal después de instalar.

Verifica que funcione:
```bash
ghcup --version
``` 

---

## ⚙️ 2. Instalar herramientas principales

Instala las versiones recomendadas por GHCup:
```bash
ghcup install ghc 9.6.7
ghcup set ghc 9.6.7

ghcup install stack
ghcup install hls
```

Verifica:
```bash
ghc --version
stack --version
haskell-language-server --version
```

---

## 📦 3. Crear un proyecto simple con Stack

Crea una carpeta nueva:
```bash
stack new intro simple
cd intro
```

Edita el archivo `stack.yaml` y asegúrate de que diga:
```yaml
resolver: lts-22.24
system-ghc: true

packages:
- .
```

Instala dependencias:
```bash
stack setup
```

---

## 👋 4. Crear un “Hola Mundo”

Abre `app/Main.hs` y deja solo esto:
```haskell
module Main where

main :: IO ()
main = putStrLn "Hola, mundo!"
```

Compila y ejecuta:
```bash
stack run
```

Deberías ver:
```
Hola, mundo!
```

---

## 🧩 5. Solución a error “no se puede encontrar -lgmp”

Si aparece este error:
```
/usr/bin/ld: no se puede encontrar -lgmp
```

Instala la librería GMP según tu distribución:

### Ubuntu / Debian
```bash
sudo apt install libgmp-dev
```

### Fedora / CentOS
```bash
sudo dnf install gmp-devel
```

### Arch / Manjaro
```bash
sudo pacman -S gmp
```

---

## 🖥️ 6. Instalar y configurar VSCode

1. Instala **VSCode** desde:  
   👉 https://code.visualstudio.com/

2. Abre VSCode y agrega las extensiones:
   - **Haskell** (by Haskell)
   - **Code Runner** *(opcional, para ejecutar rápidamente archivos `.hs`)*

3. Abre tu carpeta del proyecto:
   ```
   File → Open Folder → intro
   ```

4. VSCode detectará automáticamente el proyecto y el **Haskell Language Server** mostrará:
   - Autocompletado (`Ctrl + Espacio`)
   - Errores y advertencias en tiempo real
   - Type on hover (mantén el cursor sobre una expresión)

---

## ⚡ 7. Comandos útiles

| Comando | Descripción |
|----------|--------------|
| `stack new nombre simple` | Crea un proyecto nuevo |
| `stack setup` | Prepara el compilador GHC |
| `stack build` | Compila el proyecto |
| `stack run` | Ejecuta el programa principal |
| `stack ghc -- --version` | Muestra la versión de GHC usada por Stack |
| `ghcup tui` | Interfaz interactiva para manejar versiones |

---

## ✅ Verificación final

- GHC versión: `9.6.7`
- Stack funcional: `stack run` muestra *Hola, mundo!*
- VSCode con HLS activo: autocompletado y subrayado de errores

---

## 🧾 Créditos

Basado en la documentación oficial de:
- [GHCup](https://www.haskell.org/ghcup/)
- [Stack](https://docs.haskellstack.org/)
- [Haskell Language Server](https://haskell-language-server.readthedocs.io/)
