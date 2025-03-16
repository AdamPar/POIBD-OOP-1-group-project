# Aplikacja Sklepu – Specyfikacja i Wymagania

## Zadanie
Twoim zadaniem jest przygotowanie, przetestowanie oraz prezentacja działającej aplikacji implementującej wyspecyfikowane przez klienta wymagania.

## Wymagania

### 1. Implementacja klasy `Produkt`
- Produkt zawiera m.in. swoją nazwę, cenę oraz jedną z dostępnych kategorii.
- Produkt może być oznaczony jako dostępny lub niedostępny do zakupu.

### 2. Obsługa `Katalogu produktów`
- Katalog zawiera wszystkie produkty możliwe do kupienia w sklepie.
- Podczas uruchomienia aplikacji katalog uzupełniany jest z góry zdefiniowanymi produktami.
- Katalog umożliwia pobranie i wyświetlenie nazw oraz cen wszystkich produktów w katalogu, sortując je alfabetycznie.
- Katalog umożliwia pobranie i wyświetlenie nazw oraz cen wszystkich produktów o podanej kategorii, sortując je od najtańszych do najdroższych. Produkty niedostępne do zakupu są odfiltrowane.

### 3. Obsługa `Koszyka zakupów`
- Domyślnie koszyk jest pusty, można do niego dodawać produkty. W koszyku może znaleźć się więcej niż jeden ten sam produkt.
- Można usuwać produkty z koszyka.
- Można wyświetlić nazwy wszystkich produktów znajdujących się w koszyku oraz ich liczbę (np. "Cytryna, 2 szt.").
- Koszyk umożliwia obliczenie oraz wyświetlenie ceny całkowitej koszyka.

### 4. Dokumentacja klas
- Udokumentuj zaimplementowane klasy za pomocą prostego diagramu klas (nie UML).
- Na rysunku przedstaw wszystkie zaimplementowane w projekcie klasy w postaci prostokątów.
- Relacje między klasami przedstaw za pomocą strzałek.
- Możesz użyć narzędzia Excalidraw do stworzenia diagramu.

### 5. ⭐ Rozszerzenie – Obsługa `Promocji`
- Do koszyka można dodać promocję podając kod rabatowy. Aktywacja nowej promocji nadpisuje poprzednią.
- **Promocja 1**: "10% taniej na wszystkie produkty w koszyku" – obniża cenę całkowitą koszyka o 10%.
- **Promocja 2**: "Przy zakupie 3 produktów najtańszy jest za złotówkę" – co 3 produkty, najtańszy kosztuje 1 zł.
- **Promocja 3**: "Przy zakupie 2 takich samych produktów, drugi jest za połowę ceny" – co 2 takie same produkty, jeden kosztuje 50% swojej ceny.

### 6. ⭐ Testowanie jednostkowe (JUnit5)
- Przetestuj wybrane 2-3 funkcjonalności jednostkowo, wykorzystując technikę Given-When-Then.

## Technologie
- Język: Java
- Framework: JUnit5
- Diagramy: Excalidraw
