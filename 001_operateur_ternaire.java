int x = 10, y = 20;
int max = (x < y) ? y * 2 : x * 2 ; //Ici, max vaut 2 * 20 donc 40

/*Explication : la ligne de code int max = (x < y) ? y * 2 : x * 2 ; compare x et y. Si x est plus petit que y, alors max sera le double de y (40). Sinon, max sera le double de x (20).
C'est un moyen rapide de choisir le plus grand des deux nombres et le doubler en fonction de leur comparaison.*/
