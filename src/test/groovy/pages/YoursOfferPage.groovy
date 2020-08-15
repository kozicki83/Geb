package pages

import geb.Page

class YoursOfferPage extends Page {
    static at = { $('div h1').text() == 'TWOJA OFERTA'}
}
