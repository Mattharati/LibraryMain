import com.MainLibrary.*

class BootStrap {

    def init = { servletContext ->

   def librarian1 = new Librarian( name: 'jeff',
                                  email: 'jeff@hotmail.co.uk',
                               username: 'jeff123',
                               password: 'randyjeff1',
                              telephone: '0114 1234567').save()

   def librarian2 = new Librarian( name: 'Sarlene',
                                  email: 'saralene@hotmail.co.uk',
                               username: 'sarlene0',
                               password: 'sarlene123',
                              telephone: '0114 7654321').save()

   def librarian3 = new Librarian( name: 'Will',
                                  email: 'Will@hotmail.co.uk',
                               username: 'will23',
                               password: 'will2323',
                              telephone: '0114 1243567').save()

    }
    def destroy = {
    }
}
