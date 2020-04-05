import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchesHomeComponent } from './searches-home/searches-home.component';
import { DataHomeComponent } from './data-home/data-home.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const appRoutes: Routes = [
  {
    path: '',
    redirectTo: 'search',
    pathMatch: 'full'
  },
  { path: 'search', component: SearchesHomeComponent },
  { path: 'data', component: DataHomeComponent },
  { path: '**', component: PageNotFoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
