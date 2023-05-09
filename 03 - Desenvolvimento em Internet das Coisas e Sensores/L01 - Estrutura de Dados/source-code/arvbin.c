#include <stdio.h>
#include <stdlib.h>

struct arv {
  int info;
  struct arv* esq;
  struct arv* dir;
};

typedef struct arv Arv;

Arv* inicializa(void)
{
  return NULL;
}

Arv* cria(int c, Arv* sae, Arv* sad)
{
  Arv* p=(Arv*)malloc(sizeof(Arv));
  p->info = c;
  p->esq = sae;
  p->dir = sad;
  return p;
}

int vazia(Arv* a)
{
  return a==NULL;
}

Arv* libera (Arv* a){
  if (!vazia(a)){
    libera(a->esq); /* libera sae */
    libera(a->dir); /* libera sad */
    free(a); /* libera raiz */
  }
  return NULL;
}

void imprime_pre (Arv* a)
{
  
  if (!vazia(a)){
    printf("%d ", a->info); /* mostra raiz */
    imprime_pre(a->esq); /* mostra sae */
    imprime_pre(a->dir); /* mostra sad */
  }
}

void imprime_in (Arv* a)
{
  if (!vazia(a)){
    imprime_in(a->esq); /* mostra sae */
    printf("%d ", a->info); /* mostra raiz */
    imprime_in(a->dir); /* mostra sad */
  }
}

void imprime_pos (Arv* a)
{
  if (!vazia(a)){
    imprime_in(a->esq); /* mostra sae */
    imprime_in(a->dir); /* mostra sad */
    printf("%d ", a->info); /* mostra raiz */
  }
}

Arv* busca (Arv* a, char c){
    
  if (a == NULL) return NULL;
  else if (a->info > c) return busca(a->esq,c);
  else if (a->info < c) return busca(a->dir,c);
  else return a;
    
}

void print_enxerto(Arv* a){

  // Creating sub arvore  66 --- 3 --- 31
  // Enxerto inside the node node 80
  Arv* n80Auxe = busca(a,80);
  
  n80Auxe->esq = cria(3,
    cria(66,inicializa(),inicializa()),
    cria(31,inicializa(),inicializa()));

  imprime_pre(a);
  printf("\n");
  imprime_in(a);
  printf("\n");
  imprime_pos(a);

}

void print_podar(Arv* a){

  // Remove node 34
  Arv* n34Auxe = busca(a,34);
  
  n34Auxe = libera(n34Auxe);

  imprime_pre(a);
  printf("\n");
  imprime_in(a);
  printf("\n");
  imprime_pos(a);

}

// void remocao(Arv* arvore, int dado){
//   Arv p,q,rp,f,s;

//   p = *arvore;
  
//   while(p != NULL && p->info != dado){
//     q = p;
//     if(dado < p->info)
//       p = p->esq;
//     else p = p->dir;
//   }
//   if(p != NULL){
//     if (p->esq == NULL)
//       rp = p->dir;
//     else if (p->dir == NULL)
//       rp = p->esq;
//     else{
//       f = p;
//       rp = p->esq;
//       s = rp->dir;
//       while(s != NULL){
//         f = rp;
//         rp=s;
//         s = rp->dir;
//       }
//       if( f != p){
//         f->dir = rp->esq;
//         rp->esq = p->esq;
//       }
//       rp->dir = p->dir;
//     }
//     if(q == NULL)
//       *arvore = rp;
//     else {
//       if(p == q->esq)
//         q->esq = rp;
//       else
//         q->dir = rp;
//     }
//     free(p);
//   }
// }



int main()
{
	
/* sub-árvore com '67' */
Arv* n67= cria(67,inicializa(),inicializa());

/* sub-árvore com '12' */
Arv* n12= cria(12,inicializa(),inicializa());

/* sub-árvore com '12' */
Arv* n40= cria(40,inicializa(),inicializa());

/* sub-árvore com '34' */
Arv* n34= cria(34,inicializa(),n67);

/* sub-árvore com '5' */
Arv* n5= cria(5,n12,n34);

/* sub-árvore com '80' */
Arv* n80= cria(80,inicializa(),n40);

/* árvore com raiz '45'*/
Arv* r45 = cria(45,n5,n80);

//Print out pre -- in -- pos
imprime_pre(r45);
printf("\n");
imprime_in(r45);
printf("\n");
imprime_pos(r45);

printf("\n");
printf("Inserting the tree 66 --- 3 --- 31 left on node 80");
printf("\n");
//Print out - exerto
print_enxerto(r45);


printf("\n");
printf("Podar the node 34");
printf("\n");
print_podar(r45);

}
