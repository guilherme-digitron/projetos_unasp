# App Contador - Android em Kotlin

Um aplicativo simples de contagem para Android desenvolvido em Kotlin.

## Funcionalidades

- ✅ Aumentar contador (+)
- ✅ Diminuir contador (-)
- ✅ Contador não fica negativo (mínimo = 0)
- ✅ Botão de reset para voltar ao 0
- ✅ Interface limpa e intuitiva

## Requisitos

- Android Studio 2022.1 ou superior
- Kotlin 1.8+
- Android SDK 34
- Mínimo SDK 24 (Android 7.0)

## Como Compilar para APK

### Método 1: Via Android Studio

1. Abra o projeto em Android Studio
2. Vá para **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
3. Aguarde a compilação
4. O APK será salvo em: `contador-android/build/outputs/apk/debug/`

### Método 2: Via Gradle (Terminal/CMD)

```bash
# Debug APK
./gradlew assembleDebug

# Release APK (requer configuração de signing)
./gradlew assembleRelease
```

Os APKs estarão localizados em:
- Debug: `contador-android/build/outputs/apk/debug/`
- Release: `contador-android/build/outputs/apk/release/`

## Instalando no Dispositivo/Emulador

```bash
# Via adb
adb install contador-android/build/outputs/apk/debug/app-debug.apk
```

## Estrutura do Projeto

```
contador-android/
├── src/main/
│   ├── kotlin/com/example/contador/
│   │   └── MainActivity.kt          # Lógica principal do app
│   ├── res/
│   │   ├── layout/
│   │   │   └── activity_main.xml    # Interface do usuário
│   │   ├── values/
│   │   │   ├── strings.xml          # Strings do app
│   │   │   └── themes.xml           # Temas e cores
│   │   └── ...
│   └── AndroidManifest.xml          # Configuração do app
├── build.gradle.kts                 # Dependências e configuração
└── README.md                        # Este arquivo
```

## Código Principal (MainActivity.kt)

A lógica é simples:
- Botão **+** aumenta o contador
- Botão **−** diminui o contador (não permite valores negativos)
- Botão **Resetar** volta o contador para 0

## Autor

Desenvolvido durante o período de curso em Ciência da Computação na UNASP.
