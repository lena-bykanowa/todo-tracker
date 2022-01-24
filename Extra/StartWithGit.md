# Pierwsze kroki z repozytorium Git
Najprostszy sposób, aby zacząć pracować z repozytorium git:
1. Instalujesz gita w swoim systemie operacyjnym.
2. Konfigurujesz:
  ```
  git config -list
  git config --global user.name "Imię Nazwisko"
  git config --global user.email "adres@email.pl"
  git config --global color.status auto
  git config --global color.branch auto
  git config --global core.editor vim
  ```
3. Klonujesz repozytorium (w GitHub za pomocą przycisku `code`-> clone skopiuj link do repozytorium):
  ```
  git clone https://github.com/{USERNAME}/{nazwa-repozytorium}
  ```
np.:
  ```
  git clone https://github.com/infoshareacademy/jjdzr3-homeworks.git
  ```
  lub
  ```
  git clone git@github.com:infoshareacademy/jjdzr3-homeworks.git
  ```

4. Otwierasz folder `{nazwa-repozytorium}` w IDE IntelliJ.
5. Dodajesz lub modyfikujesz pliki z kodem.
6. Dodajesz pliki do rejestru, robisz commit i pushujesz, np.:
  ```
  git add .
  git commit -m 'Treść co zostało zmienione/dodane w języku angielskim'
  git push origin {nazwa-brancha}
  ```
7. Git może zapytać o username i hasło.

