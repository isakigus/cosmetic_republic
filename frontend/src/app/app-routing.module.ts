import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchesHomeComponent } from './searches-home/searches-home.component';

const appRoutes: Routes = [
  { path: 'search', component: SearchesHomeComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
