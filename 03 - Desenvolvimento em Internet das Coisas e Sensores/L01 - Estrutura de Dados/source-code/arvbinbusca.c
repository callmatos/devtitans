#include <stdio.h>
#include <stdlib.h>

struct arv {
  int info;
  struct arv* esq;
  struct arv* dir;
};

typedef struct arv Arv;

int vazia(Arv* a)
{
  return a==NULL;
}

Arv* busca (Arv* r, int v)
{
  if (r == NULL) return NULL;
  else if (r->info > v) return busca(r->esq,v);
  else if (r->info < v) return busca(r->dir,v);
  else return r;
}


Arv* insere (Arv* a, int v)
{
  if (a==NULL) {
    a = (Arv*)malloc(sizeof(Arv));
    a->info = v;
    a->esq = a->dir = NULL;
  }
  else if (v < a->info)
    a->esq = insere(a->esq,v);
  else /* v < a->info */
    a->dir = insere(a->dir,v);
  return a;
}


Arv* libera (Arv* a){
  if (!vazia(a)){
    libera(a->esq); /* libera sae */
    libera(a->dir); /* libera sad */
    free(a); /* libera raiz */
  }
  return NULL;
}


void imprime_in (Arv* r)
{
  if (!vazia(r)){
      imprime_in(r->esq); /* mostra sae */
      printf("%d ", r->info); /* mostra raiz */
      imprime_in(r->dir); /* mostra sad */
    }
}


void main(void)
{

  /**
   * 6) Baixe o código arvbinbusca.c. Implementar uma função que imprima a árvore in-fixada.
     Implementar uma função main que insira os seguintes elementos 1, 2, 3, 5, 15 e 7. Após cada
     inserção imprima a árvore. Buscar os elementos 2 e 8, imprimindo na tela se cada elemento foi
     encontrado ou não.
  */

  Arv* mainNo = NULL;

  mainNo = insere(mainNo,1);
  imprime_in(mainNo);
  printf("\n");

  mainNo = insere(mainNo,2);
  imprime_in(mainNo);
  printf("\n");

  mainNo = insere(mainNo,3);
  imprime_in(mainNo);
  printf("\n");

  mainNo = insere(mainNo,5);
  imprime_in(mainNo);
  printf("\n");

  mainNo = insere(mainNo,17);
  imprime_in(mainNo);
  printf("\n");

  mainNo = insere(mainNo,7);
  imprime_in(mainNo);
  printf("\n");
  printf("\n");

  printf("Finding element 2");
  printf("\n");
  Arv* nFind = busca(mainNo,2);
  if(nFind !=NULL){
    printf("Element 2 was find in the tree");
  }else{
    printf("Element 2 not find in the tree");
  }
  printf("\n\n");
  
  printf("Finding element 8");
  printf("\n");
  nFind = busca(mainNo,8);
  if(nFind !=NULL){
    printf("Element 8 was find in the tree");
  }else{
    printf("Element 8 not find in the tree");
  }
  
}
